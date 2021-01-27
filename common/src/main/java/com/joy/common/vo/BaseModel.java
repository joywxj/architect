package com.joy.common.vo;

import com.joy.pageutil.Page;
import lombok.Data;

/**
 * <p>@ClassName: BaseModel  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/29</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class BaseModel<M> {

	private Integer uuid;
	private Page<M> page = new Page<M>();

}
