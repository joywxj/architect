package com.joy.store.web;

import com.joy.pageutil.Page;
import com.joy.store.domain.bean.Store;
import com.joy.store.domain.vo.StoreQueryModel;
import com.joy.store.service.IStoreSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>@ClassName: StoreController  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/27</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Controller
@RequestMapping("/store")
@Slf4j
public class StoreController {

	@Autowired
	private IStoreSerivce service;

	@RequestMapping(value = "toList", method = RequestMethod.GET)
	public String toList() {
		return "redirect:list";
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model m, StoreQueryModel sqm) {
		if (sqm.getNowPage() != null) {
			Page<Store> queryPage = new Page<>();
			queryPage.setNowPage(sqm.getNowPage());
			sqm.setPage(queryPage);
		}
		Page<Store> page = service.queryByConditionByPage(sqm);
		m.addAttribute("page", page);
		return "store/list";
	}

	@RequestMapping(value = "toUpdate", method = RequestMethod.GET)
	public String toUpdate(Integer uuid, Model m) {
		Store store = service.get(uuid);
		m.addAttribute("store", store);
		return "store/update";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(Store stroe) {
		log.info("【修改库存】==param：{}", stroe);
		service.update(stroe);
		return "redirect:list";
	}

	@RequestMapping(value = "toAdd", method = RequestMethod.GET)
	public String toAdd() {
		return "store/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(Store stroe) {
		service.create(stroe);
		return "redirect:list";
	}

	/**
	 * 删除
	 *
	 * @param uuid
	 * @return
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(Integer uuid) {
		service.delete(uuid);
		return "redirect:list";
	}
}
