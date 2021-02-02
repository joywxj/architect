package com.joy.car.domain.vo;

import com.joy.car.domain.bean.Car;
import lombok.Data;

/**
 * <p>@ClassName: CarQueryModeal  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/2/1</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class CarQueryModel extends Car {

	private Integer nowPage = 1;
	private Integer showPage = 2;
}
