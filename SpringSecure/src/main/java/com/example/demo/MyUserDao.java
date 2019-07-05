package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserDao extends JpaRepository<User, Integer> 
{
 User findByUsername(String username);
}
