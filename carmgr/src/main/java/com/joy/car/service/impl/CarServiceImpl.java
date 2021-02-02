package com.joy.car.service.impl;

import com.joy.car.dao.CarDao;
import com.joy.car.domain.bean.Car;
import com.joy.car.domain.vo.CarQueryModel;
import com.joy.car.service.CarService;
import com.joy.common.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>@ClassName: CarServiceImpl  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/2/1</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
public class CarServiceImpl extends BaseServiceImpl<Car, CarQueryModel> implements CarService {

	private CarDao dao;

	@Autowired

	public void setDao(CarDao dao) {
		super.setDao(dao);
		this.dao = dao;
	}
}
