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
	
	@Column(name="vendor_id")
	private int vendorId;

	@Column(name="type_id")
	private int typeId;
	
	@Column(name="design_no")
	private String designNo;
 
	
	@Column(name="item_size")
	private String itemSize;
	
	@Column(name="item_quantity")
	private String itemQuantity;
	
	@Column(name="bottom_price")
	private float bottomPrice;
	
	@Column(name="item_price")
	private float itemPrice;
 
	
	@Column(name="hsnNo")
	private String hsnNo;
	
	@Column(name="invoiceDate")
	private String invoiceDate;
	
	@Column(name="po_id")
	private int poId;
	
	@Column(name="gst_per")
	private float gstPer;
	
 
	@Column(name="status")
	private int status;
	
	
	@Column(name="is_used")
	private int isUsed;


	public int getItemId() {
		return itemId;
	} 


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getVendorId() {
		return vendorId;
	}


	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}


	public int getTypeId() {
		return typeId;
	}


	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}


	public String getDesignNo() {
		return designNo;
	}


	public void setDesignNo(String designNo) {
		this.designNo = designNo;
	}


	public String getItemSize() {
		return itemSize;
	}


	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}


	public String getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public float getBottomPrice() {
		return bottomPrice;
	}


	public void setBottomPrice(float bottomPrice) {
		this.bottomPrice = bottomPrice;
	}


	public float getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getHsnNo() {
		return hsnNo;
	}


	public void setHsnNo(String hsnNo) {
		this.hsnNo = hsnNo;
	}


	public String getInvoiceDate() {
		return invoiceDate;
	}


	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}


	public int getPoId() {
		return poId;
	}


	public void setPoId(int poId) {
		this.poId = poId;
	}


	public float getGstPer() {
		return gstPer;
	}


	public void setGstPer(float gstPer) {
		this.gstPer = gstPer;
	}

 

	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public int getIsUsed() {
		return isUsed;
	}


	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", vendorId=" + vendorId + ", typeId=" + typeId
				+ ", designNo=" + designNo + ", itemSize=" + itemSize + ", itemQuantity=" + itemQuantity
				+ ", bottomPrice=" + bottomPrice + ", itemPrice=" + itemPrice + ", hsnNo=" + hsnNo + ", invoiceDate="
				+ invoiceDate + ", poId=" + poId + ", gstPer=" + gstPer + ", status=" + status + ", isUsed=" + isUsed
				+ "]";
	}


	 
	 
	
	 
}
