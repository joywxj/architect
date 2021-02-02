package com.joy.car.dao;

import com.joy.car.domain.bean.Car;
import com.joy.car.domain.vo.CarQueryModel;
import com.joy.common.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao extends BaseDao<Car, CarQueryModel> {
}
