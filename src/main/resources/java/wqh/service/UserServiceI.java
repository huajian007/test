package wqh.service;

import java.util.Map;

public interface UserServiceI {
	/**
	 * ��ȡ��¼��Ϣ
	 * 
	 * @param map
	 * @return
	 */
	public String getUserByMobile(Map map);

	/**
	 * �޸ĵ�¼����
	 * 
	 * @param map
	 */
	public int modifyPassword(Map map);
}
