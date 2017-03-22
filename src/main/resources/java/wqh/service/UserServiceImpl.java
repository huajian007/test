package wqh.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wqh.dao.UserMapper;
import wqh.model.User;
import wqh.util.LoginStatus;

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

	/**
	 * 根据手机号码查询相关信息
	 */
	public String getUserByMobile(Map map) {
		String mobile = (String) map.get("mobile");
		String password = (String) map.get("password");
		User user = null;
		try {
			user = userMapper.selectByMobile(mobile);
			String mobileStr = user.getMobile();
			String passwordStr = user.getPassword();
			String str = mobile.substring(5);
			if (user != null && mobile.equals(mobileStr) && password.equals(passwordStr)) {
				if (!str.equals(user.getPassword())) {
					if ("1".equals(user.getStatus())) {
						return LoginStatus.LOGIN_SUCCESS;
					} else {
						return LoginStatus.LOGIN_CODE;
					}
				} else {
					return LoginStatus.LOGIN_SAME;
				}
			} else {
				return LoginStatus.LOGIN_FAILD;
			}
		} catch (Exception e) {
			return LoginStatus.LOGIN_ERROR;
		}

	}
	/**
	 * 修改登录密码
	 */
	public int modifyPassword(Map map) {
		try {
			int count=userMapper.modifyPassword(map);
			return count;
		} catch (Exception e) {
			return 0;
		}
	}
}