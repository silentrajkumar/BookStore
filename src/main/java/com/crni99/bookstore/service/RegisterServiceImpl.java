package com.crni99.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crni99.bookstore.model.RegisterDetail;
import com.crni99.bookstore.repository.RegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
	RegisterDao registerDao;
	
	@Override
	public List<RegisterDetail> registerUserServ(RegisterDetail regDetailSer) {
		List<RegisterDetail> result=registerDao.registerUserDao(regDetailSer);
		System.out.println("Ser "+regDetailSer.getMailId());
		return result;
	}

	}


