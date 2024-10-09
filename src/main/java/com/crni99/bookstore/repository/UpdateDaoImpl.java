package com.crni99.bookstore.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.crni99.bookstore.model.UpdateUser;
import com.crni99.bookstore.model.UserDetail;

@Repository
public class UpdateDaoImpl implements UpdateDao {

	@Override
	public List<UpdateUser> updateUsername(UpdateUser u) {
		List<UpdateUser> user=Arrays.asList(new UpdateUser("Nivedha","raj"),
				new UpdateUser("Jesika","lokk"),
				new UpdateUser("arokia","mary"));
		HashMap<String, String> hashMap= new HashMap<>();
		hashMap.put("Nivedha","raj");
		
		/*
		 * for (Map.Entry<String, String> entry : hashMap.entrySet()) { String key =
		 * entry.getKey(); String val = entry.getValue();
		 * if(key.contains(u.getUsername())) { val.replaceAll(u.getUsername(),
		 * u.getUsernameNew()); }
		 * 
		 * }
		 */
	      for (UpdateUser userDetail : user) {
			if(u.getUsername().equals(userDetail.getUsername())) {
			 // user.set(, userDetail) ;
				//user.get(0)
				userDetail.getUsername().replaceAll(userDetail.getUsername(), userDetail.getUsernameNew());
				//u.getUsername().replace(usern, 0)
			}
		//}
		    
	      }
		return user;
	}

}
