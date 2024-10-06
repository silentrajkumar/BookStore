package com.crni99.bookstore.controller;

import java.lang.reflect.Method;
import java.util.Optional;


import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crni99.bookstore.model.UserDetail;
import com.fasterxml.jackson.annotation.JacksonInject.Value;



@Controller
public class GuestLoginController {
	//UserService userService;
	
  @RequestMapping(value="/guestLogin", method = RequestMethod.GET)
  public  String showGuestPage() {
		/*Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {// PEN-2 - Create new workflow in login controller by N787876
//			if(userService.equals(userService))
*///			{
//				System.out.println("Hi user"+u.getUsername());
//				System.out.println("Hi user"+u.getPassword());
//			}
//			else {
//				System.out.println("you are a wrong user");
//			}
			return "guestLogin";
			
			
			/*
			 * } return "redirect:/cart";
			 */
		
	}
 
  @RequestMapping(value="/guestLoginForm", method = RequestMethod.POST)
  public  String showGuestPage1(UserDetail u) {

	  if(u.getUsername().equalsIgnoreCase("rajkumar") && u.getPassword().equals("abc")) {
		  System.out.print("user");}
	  else
	  {
		  System.out.print("you are wrong user");
	  }
		return "forward:/cart";
		
	}
	@GetMapping("/access-denied-page")
	public String showAccessDeniedPage() {
		return "error";
	}
  }

