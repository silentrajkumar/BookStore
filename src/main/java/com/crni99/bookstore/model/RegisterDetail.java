package com.crni99.bookstore.model;

public class RegisterDetail {
      String userName;
      String password;
      int contactNo;
      String mailId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public RegisterDetail(String userName, String password, int contactNo, String mailId) {
		super();
		this.userName = userName;
		this.password = password;
		this.contactNo = contactNo;
		this.mailId = mailId;
	}
      
      
}
