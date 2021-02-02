package com.joy.car.domain.bean;

import com.joy.common.vo.BaseModel;
import lombok.Data;

/**
 * <p>@ClassName: Car  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/2/1</p>
 */
@Data
public class Car extends BaseModel<Car> {
	private Integer customerUuid;
	private Integer goodsUuid;
	private Integer buyNum;
}
