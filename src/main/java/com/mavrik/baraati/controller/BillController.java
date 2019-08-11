package com.mavrik.baraati.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping; 

@Controller 
public class BillController {
	
	@GetMapping("redimedBilling")
	public String showAddSubCategory(Model model) {
					 
		//model.addAttribute("categoryList",categoryRepository.findByIsUsed(0));
		return "transaction/bill/bill";
	}

}
