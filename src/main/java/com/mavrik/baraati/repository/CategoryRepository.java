package com.mavrik.baraati.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mavrik.baraati.model.Categories;	

public interface CategoryRepository extends JpaRepository<Categories,Integer>{

	
//	List<Categories> findAllByIsUsed(int isUsed);

	List<Categories> findByIsUsed(int i);
	
	@Transactional
	@Modifying
	@Query(value="update m_categories set is_used=1 where category_id=:categoryId", nativeQuery=true)
	int updateIsUsedByCategoryId(@Param("categoryId")int categoryId);
	
}
