package de.martin.restapi.auth.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import de.martin.restapi.auth.entity.UserEntity;
import de.martin.restapi.auth.repos.UserRepo;

/**
 * @author Martin
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		UserEntity user = repo.findByUsername(userName);
		
		 if(user == null) {
		      throw new UsernameNotFoundException("Username not found.");
		    }
		
		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}
	
}
