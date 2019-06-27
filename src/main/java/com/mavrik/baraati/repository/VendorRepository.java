package com.mavrik.baraati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.Vendors;

public interface VendorRepository extends JpaRepository<Vendors, Integer>{

	Vendors findByVendorId(int vendorId);
	
}
