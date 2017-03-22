package wqh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import wqh.service.UserServiceI;

@Controller
public class UserController {

	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	/**
	 * 查询工资时先登录
	 * 
	 * @param mobile
	 * @param request
	 * @return
	 */
	@RequestMapping("/login.do")
	public String login() {
		return "apps/login";
	}

	/**
	 * 验证登录信息
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/userLogin.do")
	public String userLogin(HttpServletRequest request, HttpServletResponse response) {
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		Map map = new HashMap<String, Object>();
		map.put("mobile", mobile);
		map.put("password", password);
		String str = userService.getUserByMobile(map);
		if ("00000".equals(str)) {
			return "apps/salary";
		} else if ("11111".equals(str)) {
			request.setAttribute("message", "离职人员无法查询");
			return "apps/error";
		} else if ("22222".equals(str)) {
			return "apps/password";
		} else {
			request.setAttribute("message", "帐号密码错误");
			return "apps/error";
		}
	}
	/**
	 * 修改密码
	 * @param request
	 * @param response
	 */
	@RequestMapping("/modify.do")
	public String modifyPassword(HttpServletRequest request, HttpServletResponse response){
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		Map map=new HashMap<String, Object>();
		map.put("mobile", mobile);
		map.put("password", password);
		int count=userService.modifyPassword(map);
		if(count>0){
			return "apps/login";
		}else{
			request.setAttribute("message", "密码修改失败！");
			return "apps/error";
		}
	}

}