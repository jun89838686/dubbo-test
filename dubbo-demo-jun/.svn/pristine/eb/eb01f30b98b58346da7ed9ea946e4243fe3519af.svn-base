package com.dubbo.web.action;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.company.api.entity.Company;
import com.dubbo.company.api.face.ICompanyService;
import com.dubbo.user.api.entity.User;
import com.dubbo.user.api.face.IUserService;


@Controller
@RequestMapping("/consumer")
public class ConsumerController {
	
	private static Logger LOG = LoggerFactory.getLogger(ConsumerController.class);
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private ICompanyService companyService;

	@RequestMapping("/company")
	@ResponseBody
	public Company company(HttpServletRequest request,Long id) {
		LOG.info("调用company服务，id：{}",id);
		return companyService.selectById(id);
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public User user(HttpServletRequest request,Long id) {
		LOG.info("调用user服务，id：{}",id);
		return userService.selectById(id);
	}
}
