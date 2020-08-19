/**
 * 
 */
package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mavrik.baraati.pojo.ItemWithType;

/**
 * @author kaushiku
 *
 */
public interface ItemWithTypeRepository extends JpaRepository<ItemWithType, Integer>{
	
	@Query(value="SELECT i.*,it.item_type FROM t_item_details i, m_item_type it WHERE i.type_id=it.type_id and i.is_used=:isUsed ORDER BY i.item_name ASC", nativeQuery = true)
	List<ItemWithType> findAllItemWithItemType(@Param("isUsed") int isUsed);



}
