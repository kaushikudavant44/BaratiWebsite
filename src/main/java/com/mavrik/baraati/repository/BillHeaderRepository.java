package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mavrik.baraati.model.OrderHeader;

public interface BillHeaderRepository extends JpaRepository<OrderHeader, Integer> {

	@Query(value = "select * from t_bill_header where bill_date between :frDate and :toDate and is_used=0 ", nativeQuery = true)
	List<OrderHeader> findBetweenDate(@Param("frDate") String frDate, @Param("toDate") String toDate);

	@Transactional
	@Modifying
	@Query(value="UPDATE OrderHeader set isUsed=1 where billId=:billId") 
	int deleteBill(@Param("billId")int billId);

	OrderHeader findByBillId(int billId);

	@Transactional
	@Modifying
	@Query(value="UPDATE OrderHeader set status=1 where billId=:billId") 
	int updateDetail(@Param("billId") int billId);

}
