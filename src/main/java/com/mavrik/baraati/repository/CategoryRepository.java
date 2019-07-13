package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.Categories;	

public interface CategoryRepository extends JpaRepository<Categories,Integer>{

	
	List<Categories> findAllByIsUsed(int isUsed);
}
