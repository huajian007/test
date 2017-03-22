package wqh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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



	@RequestMapping("/showPayDetail")
	public String showPayDetail(String id, HttpServletRequest request) {
		try {
			PayDetail py = payDetailService.getPayDetailByStId(Integer.parseInt(id));
			if(py==null){
				request.setAttribute("CODE", "ERROR2");
				request.setAttribute("MESSAGE", "您不是员工,不能查询工资!");
				System.out.println("dddddddddddddd");
				return "showPayDetail";
			}
			request.setAttribute("PAYDETAIL", py);
			request.setAttribute("CODE", "SUCCESS");
			
		} catch (Exception e) {
			request.setAttribute("CODE", "ERROR1");
			System.out.println("----------");
			request.setAttribute("MESSAGE", "请重新刷新!");
			return "showPayDetail";
		}
		return "showPayDetail";
	}
}
