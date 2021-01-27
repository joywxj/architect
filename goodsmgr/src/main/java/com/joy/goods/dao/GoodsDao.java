package com.joy.goods.dao;

import com.joy.common.dao.BaseDao;
import com.joy.goods.domain.bean.Goods;
import com.joy.goods.domain.vo.GoodsQueryModel;
import org.springframework.stereotype.Repository;

/**
 * <p>@ClassName: GoodDao  </p>
 * <p>@Description: 商品dao </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/24</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Repository
public interface GoodsDao extends BaseDao<Goods, GoodsQueryModel> {

}
