package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_item_details")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_name")
	private String itemName;

	@Column(name="type_id")
	private int typeId;
	
	@Column(name="design_no")
	private String designNo;
	
	@Column(name="barcode")
	private String barcode;
	
	@Column(name="item_size")
	private String itemSize;
	
	@Column(name="item_quantity")
	private String itemQuantity;
	
	@Column(name="item_price")
	private String itemPrice;
	
	@Column(name="po_id")
	private int poId;

	@Column(name="is_used")
	private int isUsed;
	
	
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

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
	 * @return the designNo
	 */
	public String getDesignNo() {
		return designNo;
	}

	/**
	 * @param designNo the designNo to set
	 */
	public void setDesignNo(String designNo) {
		this.designNo = designNo;
	}

	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * @param barcode the barcode to set
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
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
	 * @return the itemQuantity
	 */
	public String getItemQuantity() {
		return itemQuantity;
	}

	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	/**
	 * @return the itemPrice
	 */
	public String getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
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

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", typeId=" + typeId + ", designNo=" + designNo
				+ ", barcode=" + barcode + ", itemSize=" + itemSize + ", itemQuantity=" + itemQuantity + ", itemPrice="
				+ itemPrice + ", poId=" + poId + ", isUsed=" + isUsed + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	 
	
}
