package com.hospital.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hms_Inventory")
public class Inventory {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long quantity;
	private long reorder_quantity;
	private String reorder_details;
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getReorder_quantity() {
		return reorder_quantity;
	}
	public void setReorder_quantity(long reorder_quantity) {
		this.reorder_quantity = reorder_quantity;
	}
	public String getReorder_details() {
		return reorder_details;
	}
	public void setReorder_details(String reorder_details) {
		this.reorder_details = reorder_details;
	}
	

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", quantity=" + quantity + ", reorder_quantity="
				+ reorder_quantity + ", reorder_details=" + reorder_details + "]";
	}
	

	
}
