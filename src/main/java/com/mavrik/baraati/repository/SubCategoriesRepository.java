package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mavrik.baraati.model.SubCategories;

public interface SubCategoriesRepository extends JpaRepository<SubCategories, Integer>{

	
	SubCategories save(SubCategories subCategories);
	
	List<SubCategories> findByIsUsed(int isUsed);
	
	List<SubCategories> findByCategoryIdAndIsUsed(int categoryId, int isUsed);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE SubCategories set isUsed=:isUsed where subCatId=:subCatId")
	int updateIsUsedBySubCatId(@Param("subCatId")int subCatId,@Param("isUsed")int isUsed);
} 
