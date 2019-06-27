package com.mavrik.baraati.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Vendors insertVendor(HttpServletRequest request) {
		
		Vendors vendor=new Vendors();
		
		vendor.setIsUsed(0);
		vendor.setVendorAddress(request.getParameter("address"));
		vendor.setVendorContact1(request.getParameter("contact1"));
		vendor.setVendorContact2(request.getParameter("contact2"));
		vendor.setVendorEmail(request.getParameter("email"));
		vendor.setVendorGst(request.getParameter("gst"));
		vendor.setVendorName(request.getParameter("name"));
		
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
	
	

}
