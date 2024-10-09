package com.crni99.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crni99.bookstore.model.UpdateUser;
import com.crni99.bookstore.model.UserDetail;
import com.crni99.bookstore.repository.UpdateDao;

@Service
public class UpdateServiceImpl implements UpdateService {

	@Autowired
	UpdateDao updateDao;
	@Override
	public List<UpdateUser> updateUserSer(UpdateUser uu) {
		List<UpdateUser> get=updateDao.updateUsername(uu);
		return get;
	}

}
