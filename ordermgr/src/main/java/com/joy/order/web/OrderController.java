package com.joy.order.web;

import com.joy.order.domain.bean.Order;
import com.joy.order.domain.vo.OrderQueryModel;
import com.joy.order.domain.vo.OrderWebModel;
import com.joy.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>@ClassName: OrderController  </p>
 * <p>@Description: 视图控制层 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/5</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Controller
@RequestMapping(value = "/order")
@Slf4j
public class OrderController {
	@Autowired
	private IOrderService orderService = null;

	@RequestMapping(value = "/toList", method = RequestMethod.GET)
	public String toList() {
		System.out.println("跳转到查询页面");
		return "order/list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model m, OrderWebModel owm) {
		log.info("pageInfo：{}", owm);
		OrderQueryModel oqm = new OrderQueryModel();
		oqm.getPage().setNowPage(owm.getNowPage());
		if (owm.getShowPage() != 0) {
			oqm.getPage().setPageShow(owm.getShowPage());
		}
		m.addAttribute("page", this.orderService.queryByConditionByPage(oqm));
		return "order/list";
	}

	@RequestMapping(value = "/toAdd", method = RequestMethod.GET)
	public String toAdd() {

		return "order/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Order order) {

		this.orderService.create(order);
		return "";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Order order) {
		this.orderService.update(order);
		return "order/list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Integer uuid) {
		this.orderService.delete(uuid);
		return "order/delete";
	}

	@RequestMapping(value = "/toUpate", method = RequestMethod.GET)
	public String toUpate(Model m, Integer uuid) {
		Order order = this.orderService.get(uuid);
		m.addAttribute("order", order);
		return "order/upate";
	}
}
