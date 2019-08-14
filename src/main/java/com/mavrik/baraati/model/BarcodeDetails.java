package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_barcode_details")
public class BarcodeDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="barcode")
	private String barcode;
	
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
	
	@Column(name="bottom_price")
	private float bottomPrice;
	
	@Column(name="item_price")
	private float itemPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

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

	@Override
	public String toString() {
		return "BarcodeDetails [id=" + id + ", barcode=" + barcode + ", itemId=" + itemId + ", itemName=" + itemName
				+ ", vendorId=" + vendorId + ", typeId=" + typeId + ", designNo=" + designNo + ", bottomPrice="
				+ bottomPrice + ", itemPrice=" + itemPrice + "]";
	}

 
	
}
