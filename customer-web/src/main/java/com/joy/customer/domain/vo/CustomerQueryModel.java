package com.joy.customer.domain.vo;

import com.joy.customer.domain.bean.Customer;
import lombok.Data;

/**
 * <p>@ClassName: CustomerQueryModel  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/21</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class CustomerQueryModel extends Customer {
	private Integer pageShow = 2;
	private Integer nowPage = 1;
}
