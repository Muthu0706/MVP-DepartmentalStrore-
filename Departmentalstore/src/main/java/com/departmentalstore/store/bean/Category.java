package com.departmentalstore.store.bean;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table; 

  

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryid;

    @Column(name = "selectproducttype", nullable = false)
    private String selectproducttype;

    @Column(name = "description", nullable = false)
    private String description;
    
    
    
//    @OneToMany(mappedBy = "category")
//    private List<Product> products;

    
	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getSelectproducttype() {
		return selectproducttype;
	}

	public void setSelectproducttype(String selectproducttype) {
		this.selectproducttype = selectproducttype;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

  }
