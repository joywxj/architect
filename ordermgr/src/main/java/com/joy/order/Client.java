package com.joy.order;

import com.joy.order.domain.bean.Order;
import com.joy.order.domain.vo.OrderQueryModel;
import com.joy.order.service.IOrderService;
import com.joy.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>@ClassName: Client  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/5</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
//@Transactional
public class Client {

	@Autowired
	private IOrderService orderService = null;

	//	public IOrderService getOrderService() {
	//		return orderService;
	//	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Client client = (Client)ctx.getBean("client");
		Order order = new Order();
		order.setCustomerUuid(1);
		order.setUuid(1);
		order.setOrderTime("2021-1-5");
		order.setSaveMoney(5.0);
		order.setTotalMoney(5.0);
		order.setState(1);
		//		client.orderService.create(order);
		OrderQueryModel queryModel = new OrderQueryModel();
		Page<Order> page = client.orderService.queryByConditionByPage(queryModel);
		List<Order> orderList;
		orderList = page.getResult();
		for (Order o : orderList) {
			System.out.println(o.getSaveMoney());
		}
	}
}
