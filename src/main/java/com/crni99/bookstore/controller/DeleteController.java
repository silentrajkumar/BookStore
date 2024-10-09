package com.crni99.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crni99.bookstore.model.UserDetail;
import com.crni99.bookstore.service.DeleteService;
@Controller
public class DeleteController {
	@Autowired
	DeleteService deleteService;
	
   @RequestMapping(value="/delete",method=RequestMethod.GET)
   public String showDeletePage() {
	   System.out.println("Showed succesflly..");
	   return "delete";
   }
   @RequestMapping(value="/deleteForm", method=RequestMethod.POST)
   public String showDeleteForm(String userName) {
	   int flag=0;
	     List<UserDetail> userDetail= deleteService .deleteUserServ();	 
	    	 for (UserDetail userDelete : userDetail) {
	    		// System.out.println(userDelete.getUsername());
	    		 if(userName.equalsIgnoreCase(userDelete.getUsername())) {
	    			 flag=1;
	    			 userDetail.remove(userName);
	    			 System.out.println(userDelete.getUsername());
						/*
						 * for (UserDetail userDetail2 : userDetail) {
						 * System.out.println(userDetail2.getUsername()); }
						 */
		    		 
		    		  
		    	 }
		     }	
	    	 
		
	     if(flag==1) 
	    	 {
	    		 System.out.println(userName+" is deleted");
	    	 }
	    	 else {
	    		 System.out.println(userName+" Not a user");
	    	 }
	  

	   return "redirect:/book ";
   }
}
