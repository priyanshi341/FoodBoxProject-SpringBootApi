package com.simplilearn.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="foodtype")
public class FoodType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long typeid;
	private String typename;
	@ManyToOne
	private Category category;
	@OneToMany(mappedBy="foodtype")
	private List<FoodItems> m=new ArrayList<FoodItems>();
	public long getTypeid() {
		return typeid;
	}
	public void setTypeid(long typeid) {
		this.typeid = typeid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public FoodType(String typename, Category category) {
		super();
		this.typename = typename;
		this.category = category;
	}
	public FoodType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
