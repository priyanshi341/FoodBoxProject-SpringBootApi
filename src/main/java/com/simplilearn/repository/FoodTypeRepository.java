package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.entity.FoodType;

public interface FoodTypeRepository extends JpaRepository<FoodType,Long>{

}
