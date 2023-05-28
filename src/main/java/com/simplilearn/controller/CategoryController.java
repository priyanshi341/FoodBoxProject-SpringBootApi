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

import com.simplilearn.entity.Category;
import com.simplilearn.services.CategoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping("/category/{id}")
	public Category getsinglecategory(@PathVariable long id)
	{
		return categoryservice.getsingle(id);
	}
	
	@GetMapping("/category")
	public List<Category> getallcaegories()
	{
		return categoryservice.getall();
	}
	
	@PostMapping("/category")
	public void savecategory(@RequestBody Category category)
	{
		 categoryservice.save(category);
	}
	
	@PutMapping("/category/{id}")
	public void updatecategory(@RequestBody Category category,@PathVariable long id)
	{
		categoryservice.update(id, category);
	}
	@DeleteMapping("/category/{id}")
	public void deletecategory(@PathVariable long id)
	{
		categoryservice.delete(id);
	}
}
