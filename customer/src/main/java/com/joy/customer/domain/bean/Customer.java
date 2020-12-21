package com.joy.customer.domain.bean;

/**
 * <p>@ClassName: Customer  </p>
 * <p>@Description: 客户实体类 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/21</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */

public class Customer {
	//	uuid
	private Integer uuid;
	//	客户id
	private String customerId;
	//密码
	private String pwd;
	//	展示名称
	private String showName;
	//	真实名称
	private String trueName;
	//	注册时间
	private String registerTime;

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
}
