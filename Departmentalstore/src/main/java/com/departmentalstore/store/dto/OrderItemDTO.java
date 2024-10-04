package com.departmentalstore.store.dto;


public class OrderItemDTO {

    private Long orderitemid;

    
    private Long productid;
    
    private Long orderid;

    private Double costPerItem;

    private Long quntity;

    private Double totalCost;

	

	public Long getOrderitemid() {
		return orderitemid;
	}

	public void setOrderitemid(Long orderitemid) {
		this.orderitemid = orderitemid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
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

	@Override
	public String toString() {
		return "OrderItemDTO [productid=" + productid + ", orderid=" + orderid + ", costPerItem=" + costPerItem
				+ ", quntity=" + quntity + ", totalCost=" + totalCost + "]";
	}
    

}
