package com.Asissment.freshers.TrainingAssisment.model;

import java.math.BigInteger;

public class UserModel {
	
	private String id;
	private String name;
	private String department;
	private String manager;
	private int age;
	private long salary;
	
	
	
	public UserModel( String name, String department, String manager, int age, long salary) {
		super();
		
		this.name = name;
		this.department = department;
		this.manager = manager;
		this.age = age;
		this.salary = salary;
	}
	


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
