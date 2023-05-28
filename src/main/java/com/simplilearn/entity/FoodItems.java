package com.simplilearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="fooditem")
public class FoodItems {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long foodid;
	private String foodname;
	private String fooddescription;
	private long price;
	private long discount;
	@ManyToOne
	private Category category;
	@ManyToOne
	private FoodType foodtype;
	
	public FoodType getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(FoodType foodtype) {
		this.foodtype = foodtype;
	}
	public long getFoodid() {
		return foodid;
	}
	public void setFoodid(long foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getFooddescription() {
		return fooddescription;
	}
	public void setFooddescription(String fooddescription) {
		this.fooddescription = fooddescription;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public FoodItems(String foodname, String fooddescription, long price, long discount, Category category,
			FoodType foodtype) {
		super();
		this.foodname = foodname;
		this.fooddescription = fooddescription;
		this.price = price;
		this.discount = discount;
		this.category = category;
		this.foodtype = foodtype;
	}
	public FoodItems() {
		
	}
	
	
	
}
