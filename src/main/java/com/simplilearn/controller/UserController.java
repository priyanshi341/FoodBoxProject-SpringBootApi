package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.simplilearn.entity.User;
import com.simplilearn.services.UserService;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {
	
@Autowired
private UserService userservice;


@PostMapping("/user")
public User saveuser(@RequestBody User user)
{
	return userservice.saveuser(user);
}

@GetMapping("/user/{id}")
public User getadmin(@PathVariable Long id)
{
	return userservice.getuserbyid(id);
}


@GetMapping("/user")
public List<User> getallusers()
{
	return userservice.getallusers();
}

@PutMapping("/user/{id}")
public void updateuser(@PathVariable Long id,@RequestBody User user)
{
	userservice.updateadmin(id, user);
}


}
