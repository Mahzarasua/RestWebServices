package com.restwebservice.ws.rest.vo;

public class VOUser {
	private String user;
	private String password;
	private boolean valid;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public VOUser() {
	}

	public VOUser(String user, String password) {
		super();
		this.user = user;
		this.password = password;
		this.valid = true;
	}

	@Override
	public String toString() {
		return "user: " + user + " pass: " + password;
	}

}
