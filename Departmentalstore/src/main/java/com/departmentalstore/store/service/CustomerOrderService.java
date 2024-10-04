package com.departmentalstore.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.departmentalstore.store.bean.CustomerOrder;
import com.departmentalstore.store.repository.CustomerOrderRepository;

@Service
public class CustomerOrderService {
	
	  @Autowired
	    private CustomerOrderRepository CustomerOrderRepository;

	    public CustomerOrder saveCustomerOrder(CustomerOrder customerOrder) {
	        return CustomerOrderRepository.save(customerOrder);
	    }
	    
	  

	    public List<CustomerOrder> getAllCustomerorder() {
	        return CustomerOrderRepository.findAll();
	    }

	    public Optional<CustomerOrder> getCustomerorderById(Long orderid) {
	        return CustomerOrderRepository.findById(orderid);
	    }

	
	    public void CustomerOrder(Long orderid) {
	    	CustomerOrderRepository.deleteById(orderid);
	    }

}
