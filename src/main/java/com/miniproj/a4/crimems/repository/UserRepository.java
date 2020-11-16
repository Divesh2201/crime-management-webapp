package com.miniproj.a4.crimems.repository;

import org.springframework.data.repository.CrudRepository;

import com.miniproj.a4.crimems.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUsername(String username);
}
