package com.joy.common.dao;

import com.joy.common.vo.BaseModel;

import java.util.List;

/**
 * <p>@ClassName: BaseDao  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/29</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public interface BaseDao<M, QM extends BaseModel<M>> {
	/**
	 * 查询
	 *
	 * @param condition
	 * @return
	 */
	public List<M> list(QM condition);

	/**
	 * 创建
	 *
	 * @param m
	 */
	public void create(M m);

	/**
	 * 更新
	 *
	 * @param m
	 */
	public void update(M m);

	/**
	 * 删除
	 *
	 * @param uuid
	 */
	public void delete(Integer uuid);

	/**
	 * 根据主要查询
	 *
	 * @param uuid
	 * @return
	 */
	public M get(Integer uuid);

	/**
	 * 根据条件查询
	 *
	 * @param condition
	 * @return
	 */
	public List<M> queryByCondition(QM condition);

	/**
	 * 根据条件分页查询
	 *
	 * @param condition
	 * @return
	 */
	public List<M> queryByConditionByPage(QM condition);
}
