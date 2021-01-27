package com.joy.goods.domain.vo;

import com.joy.goods.domain.bean.Goods;
import lombok.Data;

/**
 * <p>@ClassName: GoodsQueryModel  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/26</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class GoodsQueryModel extends Goods {
	private Integer nowPage;
	private Integer pageShow;
}
