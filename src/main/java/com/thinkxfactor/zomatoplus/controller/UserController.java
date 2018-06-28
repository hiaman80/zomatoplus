package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Login;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public User AddUser(@RequestBody User user) {
		userRepository.saveAndFlush(user);
		return user;
	}
	@GetMapping("/getAll")
	public List<User> getAll(){
		List<User> users=userRepository.findAll();
		return users;
	}
	
	
	@PostMapping("/login")
	public User LoginUser(@RequestBody Login login) {
		User user = userRepository.findByNameAndPassword(login.getName(),login.getPassword());
		return user ;
	}
	
	
	
	
	

}
