package com.joy.customer.dao;

import com.joy.common.dao.BaseDao;
import com.joy.customer.domain.bean.Customer;
import com.joy.customer.domain.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

/**
 * <p>@ClassName: CustomerDao  </p>
 * <p>@Description: 客户持久层 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/21</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Repository
public interface CustomerDao extends BaseDao<Customer, CustomerQueryModel> {

}
