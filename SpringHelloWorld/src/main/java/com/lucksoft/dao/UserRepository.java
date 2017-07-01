package com.lucksoft.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lucksoft.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);
}