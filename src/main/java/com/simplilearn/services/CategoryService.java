package com.simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Category;
import com.simplilearn.repository.CategoryRepository;

@Service
public class CategoryService {
@Autowired
private CategoryRepository categoryrepository;

public void save(Category category)
{
	categoryrepository.save(category);
}

public Category getsingle(long id)
{
	return categoryrepository.findById(id).get();
}

public List<Category> getall()
{
	return categoryrepository.findAll();
}

public void update(long id,Category category)
{
	Category ref=categoryrepository.findById(id).get();
	ref.setCategoryname(category.getCategoryname());
	categoryrepository.save(ref);
}

public void delete(long id)
{
	categoryrepository.deleteById(id);
}
}
