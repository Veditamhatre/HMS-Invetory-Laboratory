package com.hospital.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.management.model.Inventory;
import com.hospital.management.model.LaboratoryTest;
import com.hospital.management.repository.HmsLRepository;

@Service
public class HmsLService {

	@Autowired
	private HmsLRepository repo;
	
	public void addlabtest(LaboratoryTest  l)
	{
		repo.save(l);
	}
	
	
	public List<LaboratoryTest> getalllabtest()
	{
		return repo.findAll();
	}
	
	public LaboratoryTest getlabtestById(int id)
	{
		Optional <LaboratoryTest> l= repo.findById(id);
		if(l.isPresent())
		{
			return l.get();
			
		}
		return null;
	}
	
	
	
	public void deletelabtest(int id)
	{
	repo.deleteById(id);
	}
}

