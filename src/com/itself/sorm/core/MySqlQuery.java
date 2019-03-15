package com.itself.sorm.core;

import java.util.List;

/**
 * 负责针对Mysql数据库的查询
 * @author rulework
 *
 */
public class MySqlQuery extends Query {
	/**
	 * 关于mysql的分页查询方法，必要时自己实现
	 */
	@Override
	public Object queryPagenate(int pageNum, int size) {
		//select * from Emp limit (pageNumber-1)*pageSize,pageSize
		//size表示每页要显示的条数，pageNum表示页码，
		//那么返回第pageNumber页，每页条数为pageSize的sql语句
		return null;
	}
}
