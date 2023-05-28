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

import com.simplilearn.entity.FoodItems;
import com.simplilearn.services.FoodItemService;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FoodItemController {

		@Autowired
		private FoodItemService fooditemservice;
		
		@GetMapping("/fooditem/{id}")
		public FoodItems getsinglefooditem(@PathVariable long id)
		{
			return fooditemservice.getsingle(id);
		}
		
		@GetMapping("/fooditem")
		public List<FoodItems> getallfooditems()
		{
			return fooditemservice.getall();
		}
		
		@PostMapping("/fooditem")
		public void savefooditem(@RequestBody FoodItems food)
		{
			fooditemservice.save(food);
		}
		
		@PutMapping("/fooditem/{id}")
		public void updatefooditem(@RequestBody FoodItems food,@PathVariable long id)
		{
			fooditemservice.update(id, food);
		}
		@DeleteMapping("/fooditem/{id}")
		public void deletefooditem(@PathVariable long id)
		{
			fooditemservice.delete(id);
		}
}
