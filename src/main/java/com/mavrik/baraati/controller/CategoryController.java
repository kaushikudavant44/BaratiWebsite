package com.mavrik.baraati.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.model.Categories;
import com.mavrik.baraati.repository.CategoryRepository;

@RestController
@RequestMapping("category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;

	@PostMapping("/insertCategory")
	public Categories insertCategory(HttpServletRequest request, @RequestBody Categories categories) {

		return categoryRepository.save(categories);
	}
	
	@GetMapping("/getAllCategories")
	public List<Categories> getAllCategories() {
		
		
		return categoryRepository.findAllByIsUsed(0);
	}

}
