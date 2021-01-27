package com.joy.goods.service.impl;

import com.joy.common.service.BaseServiceImpl;
import com.joy.goods.dao.GoodsDao;
import com.joy.goods.domain.bean.Goods;
import com.joy.goods.domain.vo.GoodsQueryModel;
import com.joy.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>@ClassName: GoodsServiceImpl  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/26</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
public class GoodsServiceImpl extends BaseServiceImpl<Goods, GoodsQueryModel> implements IGoodsService {

	private GoodsDao dao;

	@Autowired
	public void setDao(GoodsDao dao) {
		super.setDao(dao);
		this.dao = dao;
	}
}
