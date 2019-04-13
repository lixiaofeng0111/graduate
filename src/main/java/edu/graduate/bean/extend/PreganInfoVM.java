package edu.graduate.bean.extend;

import edu.graduate.bean.LoginRegister;

public class PreganInfoVM{
	private int id;
	private String name;
	private int pregantWeek;
	
	private LoginRegister loginRegister;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPregantWeek() {
		return pregantWeek;
	}
	public void setPregantWeek(int pregantWeek) {
		this.pregantWeek = pregantWeek;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LoginRegister getLoginRegister() {
		return loginRegister;
	}
	public void setLoginRegister(LoginRegister loginRegister) {
		this.loginRegister = loginRegister;
	}
}
