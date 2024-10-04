package com.departmentalstore.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departmentalstore.store.bean.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

	Company save(Company company);

}
