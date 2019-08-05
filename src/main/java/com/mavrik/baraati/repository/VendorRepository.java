package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mavrik.baraati.model.Vendors;

public interface VendorRepository extends JpaRepository<Vendors, Integer>{

	Vendors findByVendorId(int vendorId);
	
	List<Vendors> findByIsUsed(int isUsed);
	
	@Transactional
	@Modifying
	@Query(value="update m_vendor_details set is_used=1 where vendor_id=:vendorId", nativeQuery=true)
	int updateIsUsedByVendorId(@Param("vendorId")int vendorId);
	
}
