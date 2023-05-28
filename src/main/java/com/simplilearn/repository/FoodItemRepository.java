package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.entity.FoodItems;

public interface FoodItemRepository extends JpaRepository<FoodItems,Long>{

}
