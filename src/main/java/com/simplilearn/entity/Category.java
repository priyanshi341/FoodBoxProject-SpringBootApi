package com.simplilearn.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long categoryid;
	private String categoryname;
	@OneToMany(mappedBy="category")
	private List<FoodItems> m=new ArrayList<FoodItems>();
	@OneToMany(mappedBy="category")
	private List<FoodType> m1=new ArrayList<FoodType>();
	public long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Category(String categoryname) {
		super();
		this.categoryname = categoryname;
	}
	public Category() {
		
	}
	
}
