package com.crni99.bookstore.model;

public class UpdateUser {
String username;
String usernameNew;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUsernameNew() {
	return usernameNew;
}
public void setUsernameNew(String usernameNew) {
	this.usernameNew = usernameNew;
}
public UpdateUser(String username, String usernameNew) {
	super();
	this.username = username;
	this.usernameNew = usernameNew;
}

}
