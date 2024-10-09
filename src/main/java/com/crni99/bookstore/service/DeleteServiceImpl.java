package com.crni99.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crni99.bookstore.model.UserDetail;
import com.crni99.bookstore.repository.DeleteDao;

@Service
public class DeleteServiceImpl implements DeleteService{
	
 @Autowired
 DeleteDao deleteDao;
	@Override
	public List<UserDetail> deleteUserServ() {
		 List<UserDetail> delser= deleteDao.deleteUserDao();
		return delser;
	}

}
