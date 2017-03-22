package wqh.service;

import java.util.Map;

public interface UserServiceI {
	/**
	 * 获取登录信息
	 * 
	 * @param map
	 * @return
	 */
	public String getUserByMobile(Map map);

	/**
	 * 修改登录密码
	 * 
	 * @param map
	 */
	public int modifyPassword(Map map);
}
