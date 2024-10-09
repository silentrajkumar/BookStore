package com.crni99.bookstore.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crni99.bookstore.model.RegisterDetail;

@Repository
public class RegisterDaoImpl implements RegisterDao{

	@Override
	public List<RegisterDetail> registerUserDao(RegisterDetail regDetailDao) {
		List<RegisterDetail> reg=new ArrayList<RegisterDetail>();
		reg.add(regDetailDao);
		System.out.println("DAO"+regDetailDao.getMailId());
		return reg;
	}

		
	}

