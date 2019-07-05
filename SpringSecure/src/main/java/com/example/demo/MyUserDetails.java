package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetailsService {
	
	@Autowired
	private MyUserDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=dao.findByUsername(username);
		if(user==null)
		 throw new UsernameNotFoundException("user not found");
		return new CustomUserDetails(user);
	}

}
