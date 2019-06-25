/**
 * 
 */
package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kaushik Udavant
 *
 */
@Entity
@Table(name = "m_item_type")
public class ItemTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id")
	private int typeId;

	@Column(name = "cat_id")
	private int catId;

	@Column(name = "sub_cat_id")
	private int sub_cat_id;

	@Column(name = "item_type")
	private String item_type;

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

	/**
	 * @return the sub_cat_id
	 */
	public int getSub_cat_id() {
		return sub_cat_id;
	}

	/**
	 * @param sub_cat_id the sub_cat_id to set
	 */
	public void setSub_cat_id(int sub_cat_id) {
		this.sub_cat_id = sub_cat_id;
	}

	/**
	 * @return the item_type
	 */
	public String getItem_type() {
		return item_type;
	}

	/**
	 * @param item_type the item_type to set
	 */
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

}
