package com.weather.service;

import java.util.List;

import com.weather.entity.Users;
import com.weather.exception.UserAlreadyPresentException;
import com.weather.exception.UsersNotPresentException;

/**
 * @author Swapnil Mane
 */
public interface UserService {
	
	Users createUser(Users users)throws UserAlreadyPresentException;
	
	List<Users> getAllUsers() throws UsersNotPresentException;
}
