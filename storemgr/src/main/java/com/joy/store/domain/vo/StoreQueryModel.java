package com.joy.store.domain.vo;

import com.joy.store.domain.bean.Store;
import lombok.Data;

/**
 * <p>@ClassName: StroeQueryModel  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/27</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class StoreQueryModel extends Store {
	private Integer nowPage;
}
