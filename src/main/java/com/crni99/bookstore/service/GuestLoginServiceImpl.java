package com.crni99.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crni99.bookstore.model.UserDetail;
import com.crni99.bookstore.repository.GuestLoginDao;

@Service
public class GuestLoginServiceImpl implements GuesLoginService {
  
	@Autowired
  GuestLoginDao guestLoginDao;
	@Override
	public List<UserDetail> getUserSer() {
	List<UserDetail> guest=guestLoginDao.getUserDao();
		return guest;
	}

}
