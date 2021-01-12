package com.joy.order.domain.bean;

import com.joy.common.vo.BaseModel;

import java.io.Serializable;

/**
 * <p>@ClassName: Order  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/4</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class Order extends BaseModel<Order> implements Serializable {
	private Integer customerUuid;
	private String orderTime;
	private Double totalMoney;
	private Double saveMoney;
	private Integer state;

	@Override
	public String toString() {
		return "Order{" + "customerUuid=" + customerUuid + ", orderTime='" + orderTime + '\'' + ", totalMoney="
				+ totalMoney + ", saveMoney=" + saveMoney + ", state=" + state + '}';
	}

	public Integer getCustomerUuid() {
		return customerUuid;
	}

	public void setCustomerUuid(Integer customerUuid) {
		this.customerUuid = customerUuid;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Double getSaveMoney() {
		return saveMoney;
	}

	public void setSaveMoney(Double saveMoney) {
		this.saveMoney = saveMoney;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}
