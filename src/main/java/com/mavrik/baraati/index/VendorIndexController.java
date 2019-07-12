package com.mavrik.baraati.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * 
 * @author Kaushik Udavant
 *
 */
@Controller
public class VendorIndexController {

	@GetMapping("showAddVendor")
	public String showAdvForm(Model model) {
		
		return "master/vendor/addVendor";
	}
	
}
