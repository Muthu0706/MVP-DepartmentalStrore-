package com.departmentalstore.store.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.departmentalstore.store.bean.OrderItem;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
//    List<BalanceStatement> findAll();

}