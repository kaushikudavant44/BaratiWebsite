package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mavrik.baraati.model.OrderDetail;
 

public interface BillDetailRepository extends JpaRepository<OrderDetail, Integer>{

	List<OrderDetail> findByBillId(int billId);

	@Transactional
	@Modifying
	@Query(value="UPDATE OrderDetail set status=1 where billDetailId=:billDetailId") 
	int updateDetail(@Param("billDetailId")int billDetailId);

	@Transactional
	@Modifying
	@Query(value="UPDATE OrderDetail set status=1 where billId=:billId") 
	int updateDetailAll(@Param("billId") int billId);

}
