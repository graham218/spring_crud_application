package com.springCrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="salary")
	private float salary;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String name, int age, float salary) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}
