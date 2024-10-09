package com.crni99.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crni99.bookstore.config.WebMvcConfiguration;
import com.crni99.bookstore.model.RegisterDetail;
import com.crni99.bookstore.service.RegisterService;

@Controller

@PropertySource("classpath:application.properties")
public class RegisterController {
	@Autowired
	WebMvcConfiguration webMvcConfiguration;
	
	@Autowired
     RegisterService regservice;
	
	@Value ("${spring.mail.port}")
	public  int mailPort;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showRegisterPage() {
		
		System.out.println("page cretaed successfully"+mailPort);
		int c=webMvcConfiguration.getMailPort();
		System.out.println("Mailport "+c);
		System.out.println("page cretaed successfully");
		return "register";
	}
	@RequestMapping(value="/registerForm",method=RequestMethod.POST)
	public String showRegisterData(RegisterDetail regDetail) {
		List<RegisterDetail> regCon=regservice.registerUserServ(regDetail);
		for (RegisterDetail registerDetail : regCon) {
	             
		//if(regDetail.getUserName().equals(registerDetail)&& regDetail.getPassword().equals(registerDetail)) {
			System.out.println("HI regisetr "+regDetail.getUserName()+ " "+regDetail.getPassword()+" "+regDetail.getContactNo());;
		}
		
		
		
		
		return "redirect:/book";
	}
	
}
