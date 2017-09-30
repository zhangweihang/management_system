package com.ihtc.manage_child;

public class Parent {

	private String name;
	private String tel;
	
	public Parent() {
	
	}
	
	public Parent(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
