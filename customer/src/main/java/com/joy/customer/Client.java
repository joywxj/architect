package com.joy.customer;

import com.joy.customer.domain.bean.Customer;
import com.joy.customer.domain.vo.CustomerQueryModel;
import com.joy.customer.service.CustomerService;
import com.joy.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>@ClassName: Client  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/27</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
@Transactional
public class Client {
	@Autowired
	private CustomerService customerService = null;

	public CustomerService getCustomerService() {
		return customerService;
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Client client = (Client)ctx.getBean("client");

		Customer customer = new Customer();
		customer.setCustomerId("1");
		customer.setPwd("123456");
		customer.setShowName("joy");
		customer.setTrueName("joy");
		customer.setUuid(2);
		customer.setRegisterTime("2020-12-27");
		//		client.customerDao.create(customer);
		Page<Customer> customerPage = client.getCustomerService().queryByConditionByPage(new CustomerQueryModel());
		System.out.println("page===>" + customerPage);
		List<Customer> list = customerPage.getResult();
		for (Customer c : list) {
			System.out.println("姓名:" + c.getShowName());
		}
		customer.setShowName("吴兴军");

		client.getCustomerService().update(customer);

		//		client.customerDao.delete(1);
		CustomerQueryModel customerQueryModel = new CustomerQueryModel();

		Page<CustomerQueryModel> customerQueryModelPage = new Page<>();
		customerQueryModelPage.setNowPage(1);
		customerQueryModelPage.setPageShow(10);
		//		customerQueryModel.setPage(customerQueryModelPage);
		list = client.getCustomerService().queryByConditionByPage(customerQueryModel).getResult();

		Page<Customer> page = customerQueryModel.getPage();
		System.out.println("page=====" + page);
		for (Customer c : list) {
			System.err.println("姓名2:" + c.getShowName());
		}

	}
}
