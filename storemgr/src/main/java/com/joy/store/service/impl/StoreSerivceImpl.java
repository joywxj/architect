package com.joy.store.service.impl;

import com.joy.common.service.BaseServiceImpl;
import com.joy.store.dao.StoreDao;
import com.joy.store.domain.bean.Store;
import com.joy.store.domain.vo.StoreQueryModel;
import com.joy.store.service.IStoreSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>@ClassName: StoreSerivceImpl  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/27</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
@Slf4j
public class StoreSerivceImpl extends BaseServiceImpl<Store, StoreQueryModel> implements IStoreSerivce {
	private StoreDao dao;

	@Autowired
	public void setDao(StoreDao dao) {
		super.setDao(dao);
		this.dao = dao;
	}
}
