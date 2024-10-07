package com.crni99.bookstore.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crni99.bookstore.model.UserDetail;

@Repository
public class GuestLoginDaoImpl implements GuestLoginDao{

	@Override
	public List<UserDetail> getUserDao() {
		List<UserDetail> user=Arrays.asList(new UserDetail("Nivedha","mn0022"),
				new UserDetail("Vinoth","md22"),
				new UserDetail("Reshma","jfff22")	);
		return user;
	}

}
