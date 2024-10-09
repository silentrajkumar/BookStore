package com.crni99.bookstore.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crni99.bookstore.model.UserDetail;

@Repository
public class DeleteDaoImpl implements DeleteDao {

	@Override
	public List<UserDetail> deleteUserDao() {
		List<UserDetail> list=Arrays.asList(new UserDetail("Nithya","Mn454"),
				                            new UserDetail("Ashok", "587h"),
				                            new UserDetail("priya", "uyr6"),
				                            new UserDetail("Sowmiya", "7eyn"));
		return list;
	}

}
