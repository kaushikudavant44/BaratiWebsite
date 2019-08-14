package com.mavrik.baraati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.BarcodeDetails;

public interface BarcodeDetailsRepository extends JpaRepository<BarcodeDetails, Integer>{

	BarcodeDetails save(BarcodeDetails barcodeDetails);
	
	BarcodeDetails findByItemId(int itemId);
	
	
	
}
