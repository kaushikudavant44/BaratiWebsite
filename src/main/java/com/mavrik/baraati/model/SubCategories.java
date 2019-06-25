package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Kaushik Udavant
 *
 */
@Entity
@Table(name="m_sub_categories")
public class SubCategories {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sub_cat_id", length=11)
	private int subCatId;
	
	@Column(name="sub_cat_name")
	private String subCatName;
	
	@Column(name="isUsed")
	private int is_used;

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
	 * @return the is_used
	 */
	public int getIs_used() {
		return is_used;
	}

	/**
	 * @param is_used the is_used to set
	 */
	public void setIs_used(int is_used) {
		this.is_used = is_used;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubCategories [subCatId=" + subCatId + ", subCatName=" + subCatName + ", is_used=" + is_used + "]";
	}
	
	
	
}
