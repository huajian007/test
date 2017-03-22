package wqh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wqh.dao.UserMapper;
import wqh.model.PayDetail;

@Service("payDetailService")
public class PayDetailServiceImpl implements PayDetailServiceI {
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public PayDetail getPayDetailByStId(int id) {
		return userMapper.getPayDetailByStId(id);
	}


	 

}