package com.departmentalstore.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.departmentalstore.store.bean.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	@Query(value = "select * FROM product where categoryid=?", nativeQuery = true)
	public List<Product> findByRegion(long categoryid);


}
