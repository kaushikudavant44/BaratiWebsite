package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.ItemTypes;

public interface ItemTypesRepository extends JpaRepository<ItemTypes, Integer>{

	
	ItemTypes save(ItemTypes itemTypes);
	
 List<ItemTypes> findByIsUsed(int isUsed); 
}
