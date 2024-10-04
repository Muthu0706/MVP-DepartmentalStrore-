package com.departmentalstore.store.dto;

public class CategoryDTO {

	   private Long categoryid;
	    private String selectproducttype;
	    private String description;
	    
	    
	
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
