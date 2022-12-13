package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.model.Inventory;

@Repository
public interface HmsRepository extends JpaRepository <Inventory, Integer>{
	
	

}
