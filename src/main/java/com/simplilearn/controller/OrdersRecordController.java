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

import com.simplilearn.entity.FoodItems;
import com.simplilearn.entity.OrdersRecord;
import com.simplilearn.services.OrdersRecordService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrdersRecordController {
	@Autowired
	private OrdersRecordService orderrecordservice;
	
	@GetMapping("/order/{id}")
	public OrdersRecord getsingleorder(@PathVariable long id)
	{
		return orderrecordservice.getsingle(id);
	}
	
	@GetMapping("/order")
	public List<OrdersRecord> getallorders()
	{
		return orderrecordservice.getall();
	}
	
	@PostMapping("/order")
	public void saveorder(@RequestBody OrdersRecord order)
	{
		orderrecordservice.save(order);
	}
	
	@PutMapping("/order/{id}")
	public void updateorder(@RequestBody OrdersRecord order,@PathVariable long id)
	{
		orderrecordservice.update(id, order);
	}
	@DeleteMapping("/order/{id}")
	public void deleteorder(@PathVariable long id)
	{
		orderrecordservice.delete(id);
	}
}
