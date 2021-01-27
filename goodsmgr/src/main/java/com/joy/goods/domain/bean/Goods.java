package com.joy.goods.domain.bean;

import com.joy.common.vo.BaseModel;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>@ClassName: Good  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2021/1/26</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Data
public class Goods extends BaseModel<Goods> implements Serializable {
	private String name;
	private String imgPath;
	private String description;
}
