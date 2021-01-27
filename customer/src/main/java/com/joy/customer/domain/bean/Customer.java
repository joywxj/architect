package com.joy.customer.domain.bean;

import com.joy.common.vo.BaseModel;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>@ClassName: Customer  </p>
 * <p>@Description: 客户实体类 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/21</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class Customer extends BaseModel<Customer> implements Serializable {

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

}
