package com.simplilearn.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ordersrecord")
public class OrdersRecord {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long oid;
	private long userid;
	
	private String itemname;
	private long itemprice;
	private long quantity;
	private long totalprice;
	private String categoryname;
	private LocalDate dateoforder;
	
	
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public long getItemprice() {
		return itemprice;
	}
	public void setItemprice(long itemprice) {
		this.itemprice = itemprice;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(long totalprice) {
		this.totalprice = totalprice;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public LocalDate getDateoforder() {
		return dateoforder;
	}
	public void setDateoforder(LocalDate dateoforder) {
		this.dateoforder = dateoforder;
	}

	
	public OrdersRecord(long oid, long userid, String itemname, long itemprice, long quantity, long totalprice,
			String categoryname, LocalDate dateoforder) {
		super();
		this.oid = oid;
		this.userid = userid;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.quantity = quantity;
		this.totalprice = totalprice;
		this.categoryname = categoryname;
		this.dateoforder = dateoforder;
	}
	public OrdersRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
