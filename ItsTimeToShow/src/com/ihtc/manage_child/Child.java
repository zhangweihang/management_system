package com.ihtc.manage_child;

public class Child {
	
	private int id;
	private String name;
	private String sex;
	private int age;
	private Parent parent;
	
	public Child() {
		super();
	}
	
	public Child(String name, String sex, int age, Parent parent) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.parent = parent;
	}
	
	public Child(int id, String name, String sex, int age, Parent parent) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.parent = parent;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", parent=" + parent + "]";
	}
	
}
