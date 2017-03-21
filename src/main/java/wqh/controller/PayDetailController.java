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
		PayDetail py = payDetailService.getPayDetailByStId(Integer.parseInt(id));
		request.setAttribute("PAYDETAIL", py);
		return "showPayDetail";
	}
}
