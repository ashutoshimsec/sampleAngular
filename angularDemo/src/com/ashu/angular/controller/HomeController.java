package com.ashu.angular.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashu.angular.domain.Employee;
import com.ashu.angular.util.ApplicationContextUtil;


@Controller
public class HomeController {

	
@Autowired
ApplicationContextUtil awb;

	/* Get actual class name to be printed on */
	   static Logger log = Logger.getLogger(HomeController.class.getName());
	   
	
	@RequestMapping(value= "/")
	public String getHome(){
		System.out.println("comming to home");
		log.info("welcome this is fom logger");
		return "welcome";
	}
	
	@RequestMapping(value="/beanValue")
	@ResponseBody public void  getBeanValue(){
		ApplicationContext ac =  awb.getApplicationContext();
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println("the emp from context is "+emp.getAge());
	}
	
}
