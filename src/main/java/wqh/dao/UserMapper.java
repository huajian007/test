package wqh.dao;

import wqh.model.PayDetail;
import wqh.model.User;

public interface UserMapper {
	
	public User selectByPrimaryKey(String id);
	
	public PayDetail getPayDetailByStId(int id);
}
