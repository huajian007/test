package wqh.dao;

import wqh.model.User;

public interface UserMapper {
	
	public User selectByPrimaryKey(String id);
}
