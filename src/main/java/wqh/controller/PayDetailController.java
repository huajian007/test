package wqh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import wqh.model.PayDetail;
import wqh.service.PayDetailServiceI;

@Controller
@RequestMapping("/payDetailController")
public class PayDetailController {
	private PayDetailServiceI payDetailService;

	
	public PayDetailServiceI getPayDetailService() {
		return payDetailService;
	}

	@Autowired
	public void setPayDetailService(PayDetailServiceI payDetailService) {
		this.payDetailService = payDetailService;
	}

	@RequestMapping("/toPayDetail")
	public String toPayDetail(HttpServletRequest request) {
		return "salary";
	}

	@RequestMapping(value="showPayDetail",produces="application/json;charset=UTF-8")
	public @ResponseBody Map<String, Object>  showPayDetail(String id) {
		Map<String, Object> j = new HashMap<String, Object>();
		PayDetail py = payDetailService.getPayDetailByStId(Integer.parseInt(id));
		if(py==null){
			j.put("CODE", "-1");
			j.put("MESSAGE", "您不是员工,不能查询工资!");
		}else{
			j.put("CODE", "1");
			j.put("MESSAGE", "SUCCESS");
			j.put("DETAILE",py);
		}
		return j;
	}
}
