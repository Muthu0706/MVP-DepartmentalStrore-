package com.departmentalstore.store.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.departmentalstore.store.bean.Company;
import com.departmentalstore.store.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository Companyrepository;
	
	
	 public Company saveCompany(Company company) {
	        return Companyrepository.save(company);
	    }

	 
	

	     @Autowired
	     private CompanyRepository companyRepository;

	     public List<Company> getAllCompanies() {
	         return companyRepository.findAll();
	     }

	     public Optional<Company> getCompanyById(Long companyid) {
	         return companyRepository.findById(companyid);
	     }

	    
	     public void deleteCompany(Long companyid) {
	         companyRepository.deleteById(companyid);
	     }
	 }

	 
	 
	 
	 
