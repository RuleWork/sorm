package com.itself.sorm.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * 接口回调
 * @author rulework
 *
 */
public interface CallBack {
	public Object doExecute(Connection conn,PreparedStatement ps,ResultSet rs);
}
