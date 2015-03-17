package com.yash;

public class Message {
	private String user;
	private String msg="Hello World";

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMsg() {
		return msg+" "+getUser()+" ...!";
	}

}
