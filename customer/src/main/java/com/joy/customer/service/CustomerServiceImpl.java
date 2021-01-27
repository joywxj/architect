package com.joy.customer.service;

import com.joy.common.service.BaseServiceImpl;
import com.joy.customer.dao.CustomerDao;
import com.joy.customer.domain.bean.Customer;
import com.joy.customer.domain.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>@ClassName: CustomerServiceImpl  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/29</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
@Transactional
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerQueryModel> implements CustomerService {
	
	private CustomerDao dao;

	@Autowired
	public void setDao(CustomerDao dao) {
		super.setDao(dao);
		this.dao = dao;
	}
}
