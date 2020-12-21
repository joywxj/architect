package com.joy.customer.dao;

import com.joy.customer.Customer;
import com.joy.customer.domain.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>@ClassName: CustomerDao  </p>
 * <p>@Description: 客户持久层 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/21</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Repository
public interface CustomerDao {
	public List<Customer> list(CustomerQueryModel model);

	public void create(Customer c);

	public void update(Customer c);

	public void delete(Integer uuid);

	public Customer get(Integer uuid);

}
