package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beans.Employee;
import com.nt.service.WishMessageService;

@Controller
public class WishMessageController {
	@Autowired
	private WishMessageService  service;
	
	@RequestMapping("/welcome")
	public   String  showHome() {
		return "home";
	}
	
	@RequestMapping("/wish")
	public  String getWishMessage(Map<String,Object> map) {
		//use service 
		String msg=service.generateWishMessage();
		//keep results in model attribute
		map.put("wishMsg",msg);
		return "result";
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public String user(@Validated Employee employee, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", employee);
		return "user";
	}

}
