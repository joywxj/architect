package com.joy.order.service;

import com.joy.common.service.BaseServiceImpl;
import com.joy.order.dao.OrderDao;
import com.joy.order.domain.bean.Order;
import com.joy.order.domain.vo.OrderQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>@ClassName: OrderServiceImpl  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/5</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<Order, OrderQueryModel> implements IOrderService {

	private OrderDao dao;

	@Autowired
	public void setDao(OrderDao dao) {
		super.setDao(dao);
		this.dao = dao;
	}
}
