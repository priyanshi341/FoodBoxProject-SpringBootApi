package com.simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.FoodItems;
import com.simplilearn.entity.OrdersRecord;
import com.simplilearn.repository.OrdersRecordRepository;

@Service
public class OrdersRecordService {
	@Autowired
	private OrdersRecordRepository oredrrecordrepository;
	
	public void save(OrdersRecord orderrecord)
	{
		oredrrecordrepository.save(orderrecord);
	}

	public OrdersRecord getsingle(long id)
	{
		return oredrrecordrepository.findById(id).get();
	}

	public List<OrdersRecord> getall()
	{
		return oredrrecordrepository.findAll();
	}

	public void update(long id,OrdersRecord orderrecord)
	{
		OrdersRecord ref=oredrrecordrepository.findById(id).get();
		ref.setCategoryname(orderrecord.getCategoryname());
		ref.setDateoforder(orderrecord.getDateoforder());
		ref.setItemname(orderrecord.getItemname());
		ref.setItemprice(orderrecord.getItemprice());
		ref.setQuantity(orderrecord.getQuantity());
		ref.setTotalprice(orderrecord.getTotalprice());
		oredrrecordrepository.save(ref);
	}

	public void delete(long id)
	{
		oredrrecordrepository.deleteById(id);
	}
}
