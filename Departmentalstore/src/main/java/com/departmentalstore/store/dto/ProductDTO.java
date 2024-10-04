package com.departmentalstore.store.dto;

import java.sql.Date;

public class ProductDTO {

	private String productCode;

	private String productName;

	private Long totalStock;

	private Long categoryid;

	private Long companyid;

	private Double costPerItem;

	private Date expiryDate;
	private Date manufactureDate;
	private String description;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(Long totalStock) {
		this.totalStock = totalStock;
	}


	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Double getCostPerItem() {
		return costPerItem;
	}

	public void setCostPerItem(Double costPerItem) {
		this.costPerItem = costPerItem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "ProductDTO [productCode=" + productCode + ", productName=" + productName + ", totalStock=" + totalStock
				+ ", categoryid=" + categoryid + ", companyid=" + companyid + ", costPerItem=" + costPerItem
				+ ", expiryDate=" + expiryDate + ", manufactureDate=" + manufactureDate + ", description=" + description
				+ "]";
	}

	

//	    private Long productId;
//	    private String productCode;
//	    private String productName;
//	    private Long totalStock;
//	    private CategoryDTO category;
//	    private CompanyDTO company;
//	    private double costPerItem;
//	    private Date expiryDate;
//	    private Date manufactureDate;
//	    private String description;
//		public Long getProductId() {
//			return productId;
//		}
//		public void setProductId(Long productId) {
//			this.productId = productId;
//		}
//		public String getProductCode() {
//			return productCode;
//		}
//		public void setProductCode(String productCode) {
//			this.productCode = productCode;
//		}
//		public String getProductName() {
//			return productName;
//		}
//		public void setProductName(String productName) {
//			this.productName = productName;
//		}
//	
//		public Long getTotalStock() {
//			return totalStock;
//		}
//		public void setTotalStock(Long totalStock) {
//			this.totalStock = totalStock;
//		}
//		public CategoryDTO getCategory() {
//			return category;
//		}
//		public void setCategory(CategoryDTO category) {
//			this.category = category;
//		}
//		public CompanyDTO getCompany() {
//			return company;
//		}
//		public void setCompany(CompanyDTO company) {
//			this.company = company;
//		}
//		public double getCostPerItem() {
//			return costPerItem;
//		}
//		public void setCostPerItem(double costPerItem) {
//			this.costPerItem = costPerItem;
//		}
//		
//		public Date getExpiryDate() {
//			return expiryDate;
//		}
//		public void setExpiryDate(Date expiryDate) {
//			this.expiryDate = expiryDate;
//		}
//		public Date getManufactureDate() {
//			return manufactureDate;
//		}
//		public void setManufactureDate(Date manufactureDate) {
//			this.manufactureDate = manufactureDate;
//		}
//		public String getDescription() {
//			return description;
//		}
//		public void setDescription(String description) {
//			this.description = description;
//		}

}

//package com.example.demo.dto;
//
//import java.time.LocalDate;
//
//public class ProductRequest {
//
//    private Long productId;
//    private String productCode;
//    private String productName;
//    private int totalStock;
//    private CategoryRequest category;
//    private CompanyRequest company;
//    private double costPerItem;
//    private LocalDate expiryDate;
//    private LocalDate manufactureDate;
//    private String description;
//
//    // Getters and Setters
//}
