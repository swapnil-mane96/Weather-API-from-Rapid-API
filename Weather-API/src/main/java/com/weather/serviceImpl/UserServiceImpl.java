package com.weather.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.weather.entity.Users;
import com.weather.exception.UserAlreadyPresentException;
import com.weather.exception.UsersNotPresentException;
import com.weather.repositories.UserRepository;
import com.weather.service.UserService;

/**
 * @author Swapnil Mane
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Override
	public Users createUser(Users users){
		Optional<Users> user = this.userRepository.findByEmail(users.getEmail());
		if (!user.isPresent()) {
			users.setUserId(UUID.randomUUID().toString());
			users.setPassword(this.passwordEncoder.encode(users.getPassword()));
		    this.userRepository.save(users);
		} else
			throw new UserAlreadyPresentException("User is already present");
		return users;
		
	}

	@Override
	public List<Users> getAllUsers() {
		 List<Users> allUsers = this.userRepository.findAll();
		 if (allUsers.equals(null)) {
			 throw new UsersNotPresentException("No users present. pls register first to get users");
		 } else
			 return allUsers;
			
	}
	
}
