package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.OrdersRecord;

public interface OrdersRecordRepository extends JpaRepository<OrdersRecord,Long>{

}
