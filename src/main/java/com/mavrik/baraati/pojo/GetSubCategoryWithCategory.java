/**
 * 
 */
package com.mavrik.baraati.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kaushiku
 *
 */
@Entity
public class GetSubCategoryWithCategory {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sub_cat_id", length=11)
	private int subCatId;
	  
	@Column(name="category_id", length=11)
	private int categoryId;
	
	@Column(name="sub_cat_name")
	private String subCatName;
	
	@Column(name="is_used")
	private int isUsed;
	
	@Column(name="category_name")
	private String categoryName;

	/**
	 * @return the subCatId
	 */
	public int getSubCatId() {
		return subCatId;
	}

	/**
	 * @param subCatId the subCatId to set
	 */
	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the subCatName
	 */
	public String getSubCatName() {
		return subCatName;
	}

	/**
	 * @param subCatName the subCatName to set
	 */
	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	/**
	 * @return the isUsed
	 */
	public int getIsUsed() {
		return isUsed;
	}

	/**
	 * @param isUsed the isUsed to set
	 */
	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "getSubCategoryWithCategory [subCatId=" + subCatId + ", categoryId=" + categoryId + ", subCatName="
				+ subCatName + ", isUsed=" + isUsed + ", categoryName=" + categoryName + "]";
	}
	
	
	

}
