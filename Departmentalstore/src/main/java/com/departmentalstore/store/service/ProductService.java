package com.departmentalstore.store.service;

import java.util.List;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentalstore.store.bean.Category;
import com.departmentalstore.store.bean.Company;
import com.departmentalstore.store.bean.Product;
import com.departmentalstore.store.dto.ProductDTO;
import com.departmentalstore.store.repository.CategoryRepository;
import com.departmentalstore.store.repository.CompanyRepository;
import com.departmentalstore.store.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired  
	private ProductRepository ProductRepository;
	
    @Autowired
    private CategoryRepository CategoryRepository;
    
    @Autowired
	private CompanyRepository Companyrepository;
      
    public Product saveProduct(ProductDTO productDTO) {
    	System.err.println(productDTO);
        Category category = CategoryRepository.findById(productDTO.getCategoryid())
                .orElseThrow(() -> new RuntimeException("Category not found"));
        Company company = Companyrepository.findById(productDTO.getCompanyid())
                .orElseThrow(() -> new RuntimeException("Company not found"));
        Product product = new Product();
        product.setProductCode(productDTO.getProductCode());
        product.setProductName(productDTO.getProductName());
        product.setTotalStock(productDTO.getTotalStock());
        product.setCostPerItem(productDTO.getCostPerItem());
        product.setExpiryDate(productDTO.getExpiryDate());
        product.setManufactureDate(productDTO.getManufactureDate());
        product.setDescription(productDTO.getDescription());
        product.setCategory(category);
        product.setCompany(company);
        return ProductRepository.save(product);
    }
    
    


    
	public List<Product> getAllProducts() {
        return ProductRepository.findAll();
    }

    public Optional<Product> getProductById(Long productid) {
        return ProductRepository.findById(productid);
    }
    

    public Product saveProduct(Product product) {
        return ProductRepository.save(product);
    }

    public void deleteProduct(Long productid) {
    	ProductRepository.deleteById(productid);
    }
    
    
    
    

}




