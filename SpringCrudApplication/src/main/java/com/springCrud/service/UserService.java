package com.springCrud.service;

import java.util.List;

import com.springCrud.entity.Users;

public interface UserService {

	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	
}
