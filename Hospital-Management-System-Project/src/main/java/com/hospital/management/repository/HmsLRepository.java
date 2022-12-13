package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.model.Inventory;
import com.hospital.management.model.LaboratoryTest;

@Repository
public interface HmsLRepository  extends JpaRepository <LaboratoryTest, Integer>{
	
	

}
