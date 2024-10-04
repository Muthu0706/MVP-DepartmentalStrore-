package com.departmentalstore.store.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.departmentalstore.store.bean.Category;
import com.departmentalstore.store.bean.Company;
import com.departmentalstore.store.bean.Product;
import com.departmentalstore.store.bean.User;
import com.departmentalstore.store.dto.ProductDTO;
import com.departmentalstore.store.service.CategoryService;
import com.departmentalstore.store.service.CompanyService;
import com.departmentalstore.store.service.ProductService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/api/product")
public class ProductsController {
	
	

	 
	
	 @Autowired
	 private ProductService productService;
	    
	    @PostMapping("/productadd")
	    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) {
	        Product product = productService.saveProduct(productDTO);
	        return new ResponseEntity<>(product, HttpStatus.CREATED);
	    }

	    @GetMapping("/getAllproduct")
	    public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }

	    @GetMapping("/Productget/{productid}")
	    public Optional<Product> getProductById(@PathVariable Long productid) {
	        return productService.getProductById(productid);
	    }
	    
	    @DeleteMapping("/Delete/{productid}")
	    public void deleteProduct(@PathVariable Long productid) {
	        productService.deleteProduct(productid);
	    }


}




