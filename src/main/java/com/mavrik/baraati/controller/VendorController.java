package com.mavrik.baraati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.model.Vendors;
import com.mavrik.baraati.repository.VendorRepository;

/**
 * 
 * @author Kaushik Udavant
 *
 */
@RestController
@RequestMapping("vendor")
public class VendorController {
	
	@Autowired
	VendorRepository vendorRepository;
	
	/**
	 * 
	 * @param request
	 * @return vendor
	 */
	@PostMapping("/insertVendor")
	public String insertVendor(@RequestBody Vendors vendor) {
		
		
		System.out.println("Vendor "+vendor.toString());
		vendorRepository.save(vendor);
		
		return "master/vendor/addVendor";
	}
	
	/**
	 * 
	 * @param id
	 * @return vendor
	 */
	@GetMapping("/getVendorById/{id}")
	public Vendors getVendorById(@PathVariable("id") int id) {
		
		return vendorRepository.findByVendorId(id);
	}
	
	@GetMapping("/getAllVendors")
	public List<Vendors> getAllVendors() {
		
		return vendorRepository.findAllByIsUsed(0);
	}

}
