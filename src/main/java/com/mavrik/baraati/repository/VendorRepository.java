package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.Vendors;

public interface VendorRepository extends JpaRepository<Vendors, Integer>{

	Vendors findByVendorId(int vendorId);
	
	List<Vendors> findAllByIsUsed(int isUsed);
	
}
