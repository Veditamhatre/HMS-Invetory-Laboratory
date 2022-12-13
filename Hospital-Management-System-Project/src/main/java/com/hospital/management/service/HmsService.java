
package com.hospital.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.management.model.Inventory;
import com.hospital.management.repository.HmsRepository;


@Service
public class HmsService {
	
	@Autowired
	private HmsRepository repo;

	public void addInventory(Inventory i) 
	{
		repo.save(i);
	}
	
	
	public List<Inventory> getAllInventory()
	{
		return repo.findAll();
	}
	
	
	public Inventory getInventoryById(int id)
	{
		Optional<Inventory> i= repo.findById(id);
		if(i.isPresent())
		{
			return i.get();
		}
		return null;
		}
	
	public void deleteInventory(int id)
	{
		repo.deleteById(id);
	}
	}
