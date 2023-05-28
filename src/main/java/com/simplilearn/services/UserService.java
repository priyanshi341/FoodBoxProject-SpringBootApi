package com.simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Admin;
import com.simplilearn.entity.User;
import com.simplilearn.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepository;
	
	public User saveuser(User user)
	{
		return userrepository.save(user);
	}
	
	public User getuserbyid(Long id)
	{
		return userrepository.findById(id).get();
	}
	
	public List<User> getallusers()
	{
		return userrepository.findAll();
	}
	public void updateadmin(Long id,User user)
	{
		User userref=userrepository.findById(id).get();
		userref.setUsername(user.getUsername());
		userref.setUseremail(user.getUseremail());
		userref.setUseraddress(user.getUseraddress());
		userref.setUserphone(user.getUserphone());
		userref.setUserpassword(user.getUserpassword());
		userrepository.save(userref);
	}
}
