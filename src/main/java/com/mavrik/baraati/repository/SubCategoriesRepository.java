package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.SubCategories;

public interface SubCategoriesRepository extends JpaRepository<SubCategories, Integer>{

	
	SubCategories save(SubCategories subCategories);
	
	List<SubCategories> findByCategoryIdAndIsUsed(int categoryId, int isUsed);
} 
