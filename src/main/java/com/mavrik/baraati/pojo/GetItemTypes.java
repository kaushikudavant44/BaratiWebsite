package com.mavrik.baraati.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 
@Entity
 
public class GetItemTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id")
	private int typeId;

	@Column(name = "cat_id")
	private int catId;
	
	@Column(name="category_name")
	private String categoryName;
	

	@Column(name = "sub_cat_id")
	private int subCatId;
	
	@Column(name="sub_cat_name")
	private String subCatName;
	
	@Column(name = "item_type")
	private String itemType;
	
	@Column(name = "is_used")
	private int isUsed;

	/**
	 * @return the typeId
	 */
	public int getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return the catId
	 */
	public int getCatId() {
		return catId;
	}

	/**
	 * @param catId the catId to set
	 */
	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCatName() {
		return subCatName;
	}

	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	@Override
	public String toString() {
		return "GetItemTypes [typeId=" + typeId + ", catId=" + catId + ", categoryName=" + categoryName + ", subCatId="
				+ subCatId + ", subCatName=" + subCatName + ", itemType=" + itemType + ", isUsed=" + isUsed + "]";
	}
 
 
	 
}
