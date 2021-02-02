package com.joy.car.web;

import com.joy.car.domain.bean.Car;
import com.joy.car.domain.vo.CarQueryModel;
import com.joy.car.service.CarService;
import com.joy.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>@ClassName: CarController  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/2/1</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Controller
@RequestMapping(value = "car")
public class CarController {

	@Autowired
	private CarService service;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model m, CarQueryModel cqm) {
		Page<Car> carPage = new Page<>();

		if (cqm.getNowPage() != null) {
			carPage.setNowPage(cqm.getNowPage());
		}
		if (cqm.getShowPage() != null) {
			carPage.setPageShow(cqm.getShowPage());
		}
		cqm.setPage(carPage);

		Page<Car> page = service.queryByConditionByPage(cqm);
		m.addAttribute("page", page);
		return "car/list";
	}

	@RequestMapping(value = "toAdd", method = RequestMethod.GET)
	public String toAdd() {

		return "car/add";
	}

	@RequestMapping(value = "toUpdate", method = RequestMethod.GET)
	public String toUpdate(Model m, Integer uuid) {
		Car car = service.get(uuid);
		m.addAttribute("car", car);
		return "car/update";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(Integer uuid) {
		this.service.delete(uuid);
		return "redirect:list";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(Car car) {
		service.update(car);
		return "redirect:list";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(Car car) {
		service.create(car);
		return "redirect:list";
	}
}
