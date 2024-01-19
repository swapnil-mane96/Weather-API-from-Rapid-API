package com.weather.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.weather.entity.Users;
import com.weather.exception.UserNotFoundException;
import com.weather.repositories.UserRepository;

/**
 * @author Swapnil Mane
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	/**
     * This method used because spring security uses UserDetailsService's loadUserByUsername
     * method to fetch user from db
     */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Load user from database
		Users users = this.userRepository.findByEmail(username).orElseThrow(() -> new UserNotFoundException("User not found"));
		return users;
	}

}
