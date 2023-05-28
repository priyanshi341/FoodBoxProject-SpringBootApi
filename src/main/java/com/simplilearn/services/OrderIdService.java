package com.simplilearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.OrderId;

import com.simplilearn.repository.OrderIdRepository;

@Service
public class OrderIdService {
	@Autowired
	private OrderIdRepository orderidrepository;

	public void save(OrderId orderid)
	{
		orderidrepository.save(orderid);
	}
}
