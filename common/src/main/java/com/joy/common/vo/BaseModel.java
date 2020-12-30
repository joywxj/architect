package com.joy.common.vo;

import com.joy.pageutil.Page;

/**
 * <p>@ClassName: BaseModel  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/29</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */

public class BaseModel<M> {

	private Integer uuid;
	private Page<M> page = new Page<M>();

	public Page getPage() {
		return page;
	}

	public void setPage(Page<M> page) {
		this.page = page;
	}

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

}
