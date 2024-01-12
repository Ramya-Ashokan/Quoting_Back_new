package com.quotation.userservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quotation.userservices.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
