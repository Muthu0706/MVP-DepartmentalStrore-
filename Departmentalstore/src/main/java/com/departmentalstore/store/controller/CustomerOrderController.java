package com.departmentalstore.store.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.departmentalstore.store.bean.CustomerOrder;
import com.departmentalstore.store.service.CustomerOrderService;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/CustomerOrder")
public class CustomerOrderController {

	
	 @Autowired
	    private CustomerOrderService customerOrderService;

	    @GetMapping("/customerOrderList")
	    public List<CustomerOrder> getAllCustomerorder() {
	        return customerOrderService.getAllCustomerorder();
	    }

	    @GetMapping("/CustomerOrder/{orderid}")
	    public Optional<CustomerOrder> getCustomerorderById(@PathVariable long orderid) {
	        return customerOrderService.getCustomerorderById(orderid);
	    }

	    @PostMapping("/add")
	    public CustomerOrder createCustomerOrder(@RequestBody CustomerOrder customerOrder) {
	        return customerOrderService.saveCustomerOrder(customerOrder);
	    }

	    @PutMapping("/update/{customerOrderid}")
	    public CustomerOrder updateCategory(@PathVariable long orderid, @RequestBody CustomerOrder customerOrder) {
	    	customerOrder.setOrderid(orderid);
	        return customerOrderService.saveCustomerOrder(customerOrder);
	    }

	    @DeleteMapping("/delete/{customerid}")
	    public void deleteCustomerOrder(@PathVariable long orderid) {
	    	customerOrderService.CustomerOrder(orderid);
	    }
}
