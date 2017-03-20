package wqh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wqh.dao.UserMapper;
import wqh.model.User;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

}