package com.crni99.bookstore.model;





//@Entity
//@Table(name="UserDetails")
public class UserDetail {
	//@Column(name = "username", nullable = false)
 String username;
	//@Column(name = "password", nullable = false)
 String password;

 
public String getUsername() {
	return username;
}
public UserDetail(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

 
}
