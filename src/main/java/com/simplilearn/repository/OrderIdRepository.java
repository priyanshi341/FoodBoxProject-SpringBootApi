package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.entity.OrderId;

public interface OrderIdRepository extends JpaRepository<OrderId,Long>{

}
