package com.joy.store.domain.bean;

import com.joy.common.vo.BaseModel;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>@ClassName: Stroe  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/27</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class Store extends BaseModel<Store> implements Serializable {
	private Integer goodsUuid;
	private String storeNum;

}
