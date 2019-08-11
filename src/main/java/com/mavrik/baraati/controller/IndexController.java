package com.mavrik.baraati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mavrik.baraati.model.ItemTypes;
import com.mavrik.baraati.repository.CategoryRepository;
import com.mavrik.baraati.repository.ItemTypesRepository;

@Controller
public class IndexController {

	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	private ItemTypesRepository itemTypesRepository;
	
	@GetMapping("showSampleForm")
	public String showSampleForm(Model model) {
		
		return "common/adv_form";
	}
	
	@GetMapping("showAddItemType")
	public String showAddItemType(Model model) {
		
		
		model.addAttribute("categoryList",categoryRepository.findByIsUsed(0));
		
		return "master/item/addItemType";
	}
	
	@GetMapping("showAddItem")
	public String showAddItem(Model model) {
					 
		model.addAttribute("itemTypesList",itemTypesRepository.findByIsUsed(0));
		return "master/item/addItem";
	}
	
	@GetMapping("showAddSubCategory")
	public String showAddSubCategory(Model model) {
					 
		model.addAttribute("categoryList",categoryRepository.findByIsUsed(0));
		return "master/category/addSubCategory";
	}
	
	@GetMapping("showCategoryForm")
	public String showCategoryForm(Model model) {
		
		return "master/category/addCategory";
	}
	@GetMapping("showGenerateBill")
	public String showGenerateBill(Model model) {
		
		

		return "transaction/bill/bill";
	}
}
