package com.departmentalstore.store.bean;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Company")
public class Company {
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyid;

    @Column(name = "companyname", nullable = false)
    private String companyname;

    @Column(name = "description", nullable = false)
    private String description;
    
//    @OneToMany(mappedBy = "company")
//    private List<Product> products;

	public Long getCompanyid() {
		return companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}


	


   
}