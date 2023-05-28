package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.FoodType;

import com.simplilearn.services.FoodTypeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FoodTypeController {
	@Autowired
	private FoodTypeService foodtypeservice;
	
	@GetMapping("/foodtype/{id}")
	public FoodType getsinglefooditem(@PathVariable long id)
	{
		return foodtypeservice.getsingle(id);
	}
	
	@GetMapping("/foodtype")
	public List<FoodType> getallfooditems()
	{
		return foodtypeservice.getall();
	}
	
	@PostMapping("/foodtype")
	public void savefooditem(@RequestBody FoodType food)
	{
		foodtypeservice.save(food);
	}
	
	@PutMapping("/foodtype/{id}")
	public void updatefooditem(@RequestBody FoodType food,@PathVariable long id)
	{
		foodtypeservice.update(id, food);
	}
	@DeleteMapping("/foodtype/{id}")
	public void deletefooditem(@PathVariable long id)
	{
		foodtypeservice.delete(id);
	}
}
