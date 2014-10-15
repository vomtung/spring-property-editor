package com.vomtung.bean;

import java.util.Date;

public class Person {
	
	private String name;
	
	private PersonType type;
	
	Date birthday;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PersonType getType() {
		return type;
	}
	
	public void setType(PersonType type) {
		this.type = type;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
