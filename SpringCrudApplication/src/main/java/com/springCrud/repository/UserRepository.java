package com.springCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.springCrud.entity.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

}
