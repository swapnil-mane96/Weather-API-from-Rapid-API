package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.entity.Users;
import com.weather.exception.UserAlreadyPresentException;
import com.weather.exception.UsersNotPresentException;
import com.weather.model.ReturnData;
import com.weather.serviceImpl.UserServiceImpl;

/**
 * @author Swapnil Mane
 */
@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/saveuser")
	public ResponseEntity<?> createUser(@RequestBody Users users){
		ReturnData returnData = new ReturnData();
		 Users newUser = this.userServiceImpl.createUser(users);
		 returnData.setData(newUser);
		 returnData.setMessage("User added successfully");
		 returnData.setStatusCode("201");
		 return new ResponseEntity<ReturnData>(returnData, HttpStatus.CREATED);
	}
	
	@GetMapping("/getallusers")
	public ResponseEntity<?> getUsers(){
		return ResponseEntity.ok(this.userServiceImpl.getAllUsers());
	}
	
}
