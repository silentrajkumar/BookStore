package com.crni99.bookstore.controller;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.crni99.bookstore.service.GuesLoginService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@Controller
public class GuestLoginController {

	@Autowired
	private GuesLoginService gueslogin;

	@RequestMapping(value = "/guestLogin", method = RequestMethod.GET)
	public String showGuestPage() {
		/*
		 * Authentication authentication =
		 * SecurityContextHolder.getContext().getAuthentication(); if (authentication ==
		 * null || authentication instanceof AnonymousAuthenticationToken) {// PEN-2 -
		 * Create new workflow in login controller by N787876 //
		 * if(userService.equals(userService))
		 */// {
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

	@RequestMapping(value = "/guestLoginForm", method = RequestMethod.POST)
	public String showGuestPage1(UserDetail userInput) {

//	  if(u.getUsername().equalsIgnoreCase("rajkumar") && u.getPassword().equals("abc")) {
//		  System.out.print("user");}
//	  else
//	  {
//		  System.out.print("you are wrong user");
//	  }
		//boolean flag = false;
		int flag=0;
		List<UserDetail> userLogin = gueslogin.getUserSer();
		for (UserDetail userDetail : userLogin) {

//		 if(userDetail.getUsername().equalsIgnoreCase(u.getUsername())&& userDetail.getPassword().equals(u.getPassword())) {
//			flag=true;
//		}
//	}
//		if(flag) {
//			System.out.println("Hi user "+u.getUsername());
//		}
//		else {
//			System.out.println("Wrong user");
//		}
//		if(userDetail.getUsername().equals("Nivedha")&& userDetail.getPassword().equals("mn0022")) {
//			flag=true;
//		}
//		else if(userDetail.getUsername().equals(u) && userDetail.getPassword().equals(u)) {
//			System.out.println("Hi user"+u.getUsername());
//		}
//		}
//		
//		if(flag) {
//			System.out.println("Hi admin "+u.getUsername());
//		}
//		else {
//			System.out.println("Hi user");
//		}
			if(userInput.getUsername().equalsIgnoreCase("Nivedha")&& (userInput.getPassword().equals("mn0022"))){
				flag=1;
				//System.out.println("Hi Admin"+ userDetail.getUsername());
				break;
			}
			else if(userInput.getUsername().equalsIgnoreCase("Vinoth")&&(userInput.getPassword().equals("md22"))) {
				flag=2;
				break;
			}
			else if(userInput.getUsername().equalsIgnoreCase(userDetail.getUsername())&&userInput.getPassword().equals(userDetail.getPassword())&& userInput.getUsername().startsWith("ab")) {
				flag=3;
				//System.out.println("NOrml user");
				break;
			}
			else if(userInput.getUsername().equalsIgnoreCase(userDetail.getUsername())&&userInput.getPassword().equals(userDetail.getPassword())) {
				flag=4;
			}
			
//			else {
//				System.out.println("Nouser found ");
//			}
			
			}
		if(flag==1) {
			System.out.println("Hi Admin, "+userInput.getUsername().toUpperCase()+" Password : "+userInput.getPassword());
		}
		else if(flag==2) {
			System.out.println("HI Super User "+userInput.getUsername().toUpperCase()+" Password : "+userInput.getPassword());
		}
		
		else if(flag==3 ) {
			System.out.println("HI  Real User "+userInput.getUsername().toUpperCase()+" Password : "+userInput.getPassword());
		}
		else if(flag==4)
		{
			System.out.println("HI  Non-Real User "+userInput.getUsername().toUpperCase()+" Password : "+userInput.getPassword());
		}
		else {
			System.out.println("sorry!!Wrong user"+userInput.getUsername().toUpperCase());
		}
			
			
		
		return "forward:/cart";

	}

	@GetMapping("/access-denied-page")
	public String showAccessDeniedPage() {
		return "error";
	}
}
