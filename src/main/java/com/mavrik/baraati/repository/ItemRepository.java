package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mavrik.baraati.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	List<Item> findByIsUsedOrderByItemNameAsc(int isUsed); 

	@Transactional
	@Modifying
	@Query(value="UPDATE Item set isUsed=1 where itemId=:itemId")
	int updateIsUsedByItemId(@Param("itemId")int itemId);

	Item findByItemId(int itemId);

	Item findByDesignNoAndIsUsed(String designCode, int i);
} 
