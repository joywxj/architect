package com.joy.store.dao;

import com.joy.common.dao.BaseDao;
import com.joy.store.domain.bean.Store;
import com.joy.store.domain.vo.StoreQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDao extends BaseDao<Store, StoreQueryModel> {
	
}
