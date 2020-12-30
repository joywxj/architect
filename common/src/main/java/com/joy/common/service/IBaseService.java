package com.joy.common.service;

import com.joy.common.vo.BaseModel;
import com.joy.pageutil.Page;

import java.util.List;

public interface IBaseService<M, QM extends BaseModel<M>> {
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
	public Page<M> queryByConditionByPage(QM condition);
}
