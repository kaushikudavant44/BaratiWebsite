package com.mavrik.baraati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.OrderDetail;
 

public interface BillDetailRepository extends JpaRepository<OrderDetail, Integer>{

}
