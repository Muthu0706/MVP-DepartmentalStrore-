package com.departmentalstore.store.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
@Table(name = "OrderItem")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderitemid;

    @ManyToOne
    @JoinColumn(name = "orderid")
    private CustomerOrder customerOrder;

    @ManyToOne
    @JoinColumn(name = "productid")
    private Product product;

    @Column(name = "costPerItem", nullable = false)
    private Double costPerItem;

    @Column(name = "quntity", nullable = false)
    private Long quntity;

    @Column(name = "totalCost", nullable = false)
    private Double totalCost;

	public Long getOrderitemid() {
		return orderitemid;
	}

	public void setOrderitemid(Long orderitemid) {
		this.orderitemid = orderitemid;
	}


	
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getCostPerItem() {
		return costPerItem;
	}

	public void setCostPerItem(Double costPerItem) {
		this.costPerItem = costPerItem;
	}

	public Long getQuntity() {
		return quntity;
	}

	public void setQuntity(Long quntity) {
		this.quntity = quntity;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}



  
}
