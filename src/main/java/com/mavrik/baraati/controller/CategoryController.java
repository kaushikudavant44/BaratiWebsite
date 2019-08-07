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
import com.mavrik.baraati.model.SubCategories;
import com.mavrik.baraati.pojo.GetSubCategoryWithCategory;
import com.mavrik.baraati.repository.CategoryRepository;
import com.mavrik.baraati.repository.GetSubCategoryWithCategoryRepository;
import com.mavrik.baraati.repository.SubCategoriesRepository;

@RestController
@RequestMapping("category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	SubCategoriesRepository subCategoriesRepository;
	
	@Autowired
	GetSubCategoryWithCategoryRepository getSubCategoryWithCategoryRepository;

	@PostMapping("/insertCategory")
	public Categories insertCategory(HttpServletRequest request, @RequestBody Categories categories) {

		return categoryRepository.save(categories);
	}

	@GetMapping("/getAllCategories")
	public List<Categories> getAllCategories() {

		return categoryRepository.findByIsUsed(0);
	}
	
	
	@PostMapping("/insertSubCategory")
	public SubCategories insertSubCategory(HttpServletRequest request, @RequestBody SubCategories subCategories) {

		return subCategoriesRepository.save(subCategories);
	}
	
	@GetMapping("/getAllSubCategories")
	public List<GetSubCategoryWithCategory> getAllSubCategories() {

		return getSubCategoryWithCategoryRepository.findByIsUsed(0);
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
	
	@PutMapping("/deleteSubCategory")
	public Info deleteSubCategory(@RequestParam("subCatId") int subCatId) {
		Info info = new Info();

		System.out.println("subcat id" + subCatId);

		int status = subCategoriesRepository.updateIsUsedBySubCatId(subCatId,1);
		if (status == 1) {
			info.setError(false);
			info.setMessage("Deleted Successfully");
		} else {

			info.setError(true);
			info.setMessage("SubCategory not deleted. Please try again.");
		}
		System.out.println(info.toString());
		
		return info;
		
	}

}
