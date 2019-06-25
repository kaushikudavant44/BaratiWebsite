package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_po_details")
public class PODetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "po_detail_id")
	private int poDetailId;
	
	@Column(name = "po_id")
	private int poId;; 
	
	@Column(name = "type_id")
	private int type_id;
	
	@Column(name = "item_size")
	private String itemSize;
	
	@Column(name = "require_quantity")
	private int requireQuantity;
	
	@Column(name = "receive_quantity")
	private float receiveQuantity;
	
	@Column(name = "item_price")
	private float itemPrice;

	/**
	 * @return the poDetailId
	 */
	public int getPoDetailId() {
		return poDetailId;
	}

	/**
	 * @param poDetailId the poDetailId to set
	 */
	public void setPoDetailId(int poDetailId) {
		this.poDetailId = poDetailId;
	}

	/**
	 * @return the poId
	 */
	public int getPoId() {
		return poId;
	}

	/**
	 * @param poId the poId to set
	 */
	public void setPoId(int poId) {
		this.poId = poId;
	}

	/**
	 * @return the type_id
	 */
	public int getType_id() {
		return type_id;
	}

	/**
	 * @param type_id the type_id to set
	 */
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	/**
	 * @return the itemSize
	 */
	public String getItemSize() {
		return itemSize;
	}

	/**
	 * @param itemSize the itemSize to set
	 */
	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

	/**
	 * @return the requireQuantity
	 */
	public int getRequireQuantity() {
		return requireQuantity;
	}

	/**
	 * @param requireQuantity the requireQuantity to set
	 */
	public void setRequireQuantity(int requireQuantity) {
		this.requireQuantity = requireQuantity;
	}

	/**
	 * @return the receiveQuantity
	 */
	public float getReceiveQuantity() {
		return receiveQuantity;
	}

	/**
	 * @param receiveQuantity the receiveQuantity to set
	 */
	public void setReceiveQuantity(float receiveQuantity) {
		this.receiveQuantity = receiveQuantity;
	}

	/**
	 * @return the itemPrice
	 */
	public float getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PODetails [poDetailId=" + poDetailId + ", poId=" + poId + ", type_id=" + type_id + ", itemSize="
				+ itemSize + ", requireQuantity=" + requireQuantity + ", receiveQuantity=" + receiveQuantity
				+ ", itemPrice=" + itemPrice + "]";
	}

	
	
	
	
}
