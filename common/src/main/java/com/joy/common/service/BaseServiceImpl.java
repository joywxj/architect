package com.joy.common.service;

import com.joy.common.dao.BaseDao;
import com.joy.common.vo.BaseModel;
import com.joy.pageutil.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>@ClassName: BaseServiceImpl  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/29</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
@Service
public class BaseServiceImpl<M, QM extends BaseModel<M>> implements IBaseService<M, QM> {
	private BaseDao<M, QM> dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	/**
	 * 查询
	 *
	 * @param condition
	 * @return
	 */
	@Override
	public List<M> list(QM condition) {
		return this.dao.list(condition);
	}

	/**
	 * 创建
	 *
	 * @param m
	 */
	@Override
	public void create(M m) {
		this.dao.create(m);
	}

	/**
	 * 更新
	 *
	 * @param m
	 */
	@Override
	public void update(M m) {
		this.dao.update(m);
	}

	/**
	 * 删除
	 *
	 * @param uuid
	 */
	@Override
	public void delete(Integer uuid) {
		this.dao.delete(uuid);
	}

	/**
	 * 根据主要查询
	 *
	 * @param uuid
	 * @return
	 */
	@Override
	public M get(Integer uuid) {
		return dao.get(uuid);
	}

	/**
	 * 根据条件查询
	 *
	 * @param condition
	 * @return
	 */
	@Override
	public List<M> queryByCondition(QM condition) {
		return this.queryByCondition(condition);
	}

	/**
	 * 根据条件分页查询
	 *
	 * @param condition
	 * @return
	 */
	@Override
	public Page<M> queryByConditionByPage(QM condition) {
		condition.getPage().setResult(dao.queryByConditionByPage(condition));
		return condition.getPage();
	}
}
