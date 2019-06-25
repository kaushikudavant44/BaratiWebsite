package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_categories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id", length=11)
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="is_used")
	private int isUsed;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", isUsed=" + isUsed + "]";
	}
	
	
	
}
