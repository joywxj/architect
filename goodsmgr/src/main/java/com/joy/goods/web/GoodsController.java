package com.joy.goods.web;

import com.joy.goods.domain.bean.Goods;
import com.joy.goods.domain.vo.GoodsQueryModel;
import com.joy.goods.service.IGoodsService;
import com.joy.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>@ClassName: GoodsController  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/26</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Controller
@RequestMapping("/good")
public class GoodsController {

	@Autowired
	private IGoodsService goodsService;

	@RequestMapping(value = "toList", method = RequestMethod.GET)
	public String toList() {

		return "redirect:list";
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(GoodsQueryModel qm, Model ma) {
		Page<Goods> pageCondition = new Page<>();
		if (qm.getPageShow() != null) {
			pageCondition.setPageShow(qm.getPageShow());

		}
		if (qm.getNowPage() != null) {
			pageCondition.setNowPage(qm.getNowPage());
		}
		qm.setPage(pageCondition);
		Page<Goods> page = goodsService.queryByConditionByPage(qm);
		ma.addAttribute("page", page);
		return "goods/list";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(Integer uuid) {
		goodsService.delete(uuid);
		return "redirect:list";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(Goods good) {
		goodsService.update(good);
		return "redirect:list";
	}

	@RequestMapping(value = "toUpdate", method = RequestMethod.GET)
	public String toUpdate(Integer uuid, Model m) {
		Goods goods = goodsService.get(uuid);
		m.addAttribute("updateModel", goods);
		return "goods/update";
	}

	@RequestMapping(value = "toAdd", method = RequestMethod.GET)
	public String toAdd() {

		return "goods/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(Goods good) {
		goodsService.create(good);
		return "redirect:list";
	}
}
