package com.crni99.bookstore.repository;

import java.util.List;

import com.crni99.bookstore.model.UpdateUser;
import com.crni99.bookstore.model.UserDetail;

public interface UpdateDao {
//public List<UserDetail> updateUsername(UserDetail ud);

public List<UpdateUser> updateUsername(UpdateUser u);
}
 