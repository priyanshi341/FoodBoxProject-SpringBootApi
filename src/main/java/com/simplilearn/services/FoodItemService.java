package com.simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.FoodItems;
import com.simplilearn.repository.FoodItemRepository;


@Service
public class FoodItemService {
	@Autowired
	private FoodItemRepository foodrepository;

	public void save(FoodItems food)
	{
		foodrepository.save(food);
	}

	public FoodItems getsingle(long id)
	{
		return foodrepository.findById(id).get();
	}

	public List<FoodItems> getall()
	{
		return foodrepository.findAll();
	}

	public void update(long id,FoodItems food)
	{
		FoodItems ref=foodrepository.findById(id).get();
		ref.setCategory(food.getCategory());
		ref.setDiscount(food.getDiscount());
		ref.setFooddescription(food.getFooddescription());
		ref.setFoodname(food.getFoodname());
		ref.setPrice(food.getPrice());
		ref.setFoodtype(food.getFoodtype());
		foodrepository.save(ref);
	}

	public void delete(long id)
	{
		foodrepository.deleteById(id);
	}
}
