package com.megas.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.megas.security.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}