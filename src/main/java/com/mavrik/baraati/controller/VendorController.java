package com.mavrik.baraati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.common.Info;
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
	public Vendors insertVendor(@RequestBody Vendors vendor) {
		
		System.out.println("Vendor det"+vendor.toString());
		
		return vendorRepository.save(vendor);
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
		
		return vendorRepository.findByIsUsed(0);
	}
	
	@PutMapping("/deleteVendor")
	public Info deleteCategory(@RequestParam("vendorId") int vendorId) {
		Info info = new Info();

		System.out.println("category id" + vendorId);

		int status = vendorRepository.updateIsUsedByVendorId(vendorId);
		if (status == 1) {
			info.setError(false);
			info.setMessage("Deleted Successfully");
		} else {

			info.setError(true);
			info.setMessage("Vendor not deleted. Please try again.");
		}
		System.out.println(info.toString());
		
		return info;
		
	}

}
