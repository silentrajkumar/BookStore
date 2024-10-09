package com.crni99.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crni99.bookstore.model.UpdateUser;
import com.crni99.bookstore.model.UserDetail;
import com.crni99.bookstore.service.UpdateService;
//@Configuration
@Controller
//@PropertySource("classpath:application.properties")
public class UpdateController {
//	@Value("${spring.mail.port}")
//	public int mailport;
	
	@Autowired
	UpdateService updateService;
@RequestMapping(value="/update",method=RequestMethod.GET)
public String showUpdatePage() {
	System.out.println("Update form cretae suceesfully...");
	return "update";
	
	
}

@RequestMapping(value="/updateForm",method=RequestMethod.POST)
public String updatePage(UpdateUser user) {
	List<UpdateUser> result=updateService.updateUserSer(user);
	for (UpdateUser userDetail : result) {
		System.out.println(userDetail.getUsername());
	}
	return " redirect:/login";
	
	
	
}
}
