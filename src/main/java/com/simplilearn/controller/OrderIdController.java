package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.OrderId;
import com.simplilearn.services.OrderIdService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderIdController {
	@Autowired
	private OrderIdService orderidservice;
	
	@PostMapping("/orderid")
	public long saveorderid(OrderId orderid)
	{
		orderidservice.save(orderid);
		return orderid.getId();
	}
}
