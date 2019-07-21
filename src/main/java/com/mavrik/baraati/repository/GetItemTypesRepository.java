package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mavrik.baraati.pojo.GetItemTypes;

public interface GetItemTypesRepository extends JpaRepository<GetItemTypes, Integer>{

	
	@Query(value="SELECT t.*, c.category_name, s.sub_cat_name from m_item_type t, m_sub_categories s, m_categories"
			+ " c WHERE t.cat_id=c.category_id AND t.sub_cat_id=s.sub_cat_id AND t.is_used=0",nativeQuery=true)
	List<GetItemTypes> getItemType();
}
