package com.joy.customer.web;

import com.joy.customer.domain.bean.Customer;
import com.joy.customer.domain.vo.CustomerQueryModel;
import com.joy.customer.service.CustomerService;
import com.joy.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>@ClassName: CustomerController  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/30</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	private CustomerService service = null;

	@RequestMapping(value = "toList", method = RequestMethod.GET)
	public String toList(@ModelAttribute("wm") CustomerQueryModel wm, Model model) {


		Page<Customer> page = new Page<>();

		page.setNowPage(wm.getNowPage());
		page.setPageShow(wm.getPageShow());
		wm.setPage(page);
		Page<Customer> customerPage = service.queryByConditionByPage(wm);

		model.addAttribute("wm", wm);
		model.addAttribute("page", customerPage);

		return "customer/list";
	}

	@RequestMapping(value = "get", method = RequestMethod.GET)
	public String get(Integer uuid, Model model) {

		Customer customer = service.get(uuid);
		model.addAttribute("customer", customer);

		return "customer/list";
	}

	@RequestMapping(value = "toUpdate", method = RequestMethod.GET)
	public String toUpdate(Integer uuid, Model model) {

		Customer customer = service.get(uuid);
		model.addAttribute("customer", customer);

		return "customer/update";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(Integer uuid, Model model) {

		service.delete(uuid);

		return "redirect:toList";
	}

	/**
	 * 修改
	 *
	 * @param c
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(Customer c) {

		service.update(c);

		return "customer/list";
	}
}
