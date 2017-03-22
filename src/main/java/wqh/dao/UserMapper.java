package wqh.dao;

import java.util.Map;

import wqh.model.PayDetail;
import wqh.model.User;

public interface UserMapper {	
	public User selectByMobile(String mobile);
	
	public int modifyPassword(Map map);
	
	public PayDetail getPayDetailByStId(String id);
	
}
