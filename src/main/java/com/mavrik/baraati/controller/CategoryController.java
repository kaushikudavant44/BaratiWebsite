package com.mavrik.baraati.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mavrik.baraati.common.Info;
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

		return categoryRepository.findByIsUsed(0);
	}

	/**
	 * 
	 * @param categoryId
	 * @return
	 */
	@PutMapping("/deleteCategory")
	public Info deleteCategory(@RequestParam("categoryId") int categoryId) {
		Info info = new Info();

		System.out.println("category id" + categoryId);

		int status = categoryRepository.updateIsUsedByCategoryId(categoryId);
		if (status == 1) {
			info.setError(false);
			info.setMessage("Deleted Successfully");
		} else {

			info.setError(true);
			info.setMessage("Category not deleted. Please try again.");
		}
		System.out.println(info.toString());
		
		return info;
		
	}

}
