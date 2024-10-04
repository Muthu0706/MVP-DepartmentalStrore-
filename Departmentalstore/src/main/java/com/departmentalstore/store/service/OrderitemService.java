package com.departmentalstore.store.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.departmentalstore.store.bean.CustomerOrder;
import com.departmentalstore.store.bean.OrderItem;
import com.departmentalstore.store.bean.Product;
import com.departmentalstore.store.dto.OrderItemDTO;
import com.departmentalstore.store.repository.CustomerOrderRepository;
import com.departmentalstore.store.repository.OrderItemRepository;
import com.departmentalstore.store.repository.ProductRepository;


@Service
public class OrderitemService {
	
  @Autowired
  private OrderItemRepository repository;
  
  @Autowired
  private ProductRepository productRepository;
  
  @Autowired
  private CustomerOrderRepository customerorderRepository;

  
  public OrderItem saveOrderItem(OrderItemDTO orderitemDTO)
  {
  	System.err.println(orderitemDTO);

	  Product product =productRepository.findById(orderitemDTO.getProductid()).orElseThrow(() -> new
			  RuntimeException("Product not found"));
	  CustomerOrder  customerOrder=customerorderRepository.findById(orderitemDTO.getOrderid()).orElseThrow(() ->
	  new RuntimeException("Customer not found"));
	  
	  OrderItem orderItem =new OrderItem();
	  orderItem.setCostPerItem(orderitemDTO.getCostPerItem());
	  orderItem.setQuntity(orderitemDTO.getQuntity());
	  orderItem.setTotalCost(orderitemDTO.getTotalCost());
	  orderItem.setProduct(product);
	  orderItem.setCustomerOrder(customerOrder);
	  
//    product.setCompany(company);
    return repository.save(orderItem);
	  
  }
  
	public List<OrderItem> getAllOderItem() {
        return repository.findAll();
    }

    public Optional<OrderItem> getOderItemById(Long orderitemid) {
        return repository.findById(orderitemid);
    }

    public void deleteOderItem(Long orderitemid) {
    	repository.deleteById(orderitemid);
    }
    
}
