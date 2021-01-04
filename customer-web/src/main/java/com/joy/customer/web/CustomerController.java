package com.joy.customer.web;

import com.joy.customer.domain.bean.Customer;
import com.joy.customer.domain.vo.CustomerQueryModel;
import com.joy.customer.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ClassName: CustomerController  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/30</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	private CustomerService service;

	@RequestMapping(value = "toList", method = RequestMethod.GET)
	public String toList(@ModelAttribute("wm") CustomerQueryModel wm, Model model) {

		Page<Customer> customerPage = (Page<Customer>)service.queryByConditionByPage(wm);

		//
		model.addAttribute("wm", wm);
		model.addAttribute("page", customerPage);

		return "goods/list";
	}
}
