package com.joy.order.dao;

import com.joy.common.dao.BaseDao;
import com.joy.order.domain.bean.Order;
import com.joy.order.domain.vo.OrderQueryModel;
import org.springframework.stereotype.Repository;

/**
 * <p>@ClassName: OrderDao  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/4</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Repository
public interface OrderDao extends BaseDao<Order, OrderQueryModel> {

}
