package com.simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.simplilearn.entity.FoodType;
import com.simplilearn.repository.FoodTypeRepository;

@Service
public class FoodTypeService {
@Autowired
private FoodTypeRepository foodtyperepository;

public void save(FoodType food)
{
	foodtyperepository.save(food);
}

public FoodType getsingle(long id)
{
	return foodtyperepository.findById(id).get();
}

public List<FoodType> getall()
{
	return foodtyperepository.findAll();
}

public void update(long id,FoodType food)
{
	FoodType ref=foodtyperepository.findById(id).get();
	ref.setTypename(food.getTypename());
	ref.setCategory(food.getCategory());
	foodtyperepository.save(ref);
}

public void delete(long id)
{
	foodtyperepository.deleteById(id);
}


}
