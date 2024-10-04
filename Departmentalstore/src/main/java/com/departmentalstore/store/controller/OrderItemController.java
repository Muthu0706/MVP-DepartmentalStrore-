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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departmentalstore.store.bean.OrderItem;
import com.departmentalstore.store.bean.Product;
import com.departmentalstore.store.dto.OrderItemDTO;
import com.departmentalstore.store.dto.ProductDTO;
import com.departmentalstore.store.service.OrderitemService;



@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/OrderItem")
public class OrderItemController {

	
	@Autowired
	private OrderitemService orderitemservice;
	
	
	
    @PostMapping("/orderItemadd")
    public ResponseEntity<OrderItem> createProduct(@RequestBody OrderItemDTO orderItemDTO) {
        OrderItem orderItem = orderitemservice.saveOrderItem(orderItemDTO);
        return new ResponseEntity<>(orderItem, HttpStatus.CREATED);
    }
    
    
//    @PostMapping("/productadd")
//    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) {
//        Product product = productService.saveProduct(productDTO);
//        return new ResponseEntity<>(product, HttpStatus.CREATED);
//    }

    @GetMapping("/getAllOrderItem")
    public List<OrderItem> getAllOderItem() {
        return orderitemservice.getAllOderItem();
    }

    @GetMapping("/{orderitemid}")
    public Optional<OrderItem> getProductById(@PathVariable Long orderitemid) {
        return orderitemservice.getOderItemById(orderitemid);
    }
    
    @DeleteMapping("/Delete/{orderitemid}")
    public void deleteProduct(@PathVariable Long orderitemid) {
    	orderitemservice.deleteOderItem(orderitemid);
    }

}
