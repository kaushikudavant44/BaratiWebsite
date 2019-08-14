package com.mavrik.baraati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.OrderHeader;

public interface BillHeaderRepository extends JpaRepository<OrderHeader, Integer>{

}
