package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mavrik.baraati.pojo.GetSubCategoryWithCategory;

public interface GetSubCategoryWithCategoryRepository extends JpaRepository<GetSubCategoryWithCategory, Integer>{
	
	@Query(value="SELECT s.*,c.category_name FROM m_sub_categories s, m_categories c WHERE c.category_id=s.category_id AND s.is_used=:isUsed ORDER BY s.sub_cat_name ASC;", nativeQuery = true)
	List<GetSubCategoryWithCategory> findByIsUsed(@Param("isUsed")int isUsed);
	
}
