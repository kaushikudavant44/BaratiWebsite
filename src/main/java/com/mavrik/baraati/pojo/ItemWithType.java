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
public class ItemWithType {
	
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

	
	@Column(name="item_type")
	private String itemType;

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
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	/**
	 * @return the vendorId
	 */
	public int getVendorId() {
		return vendorId;
	}

	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	/**
	 * @return the bottomPrice
	 */
	public float getBottomPrice() {
		return bottomPrice;
	}

	/**
	 * @param bottomPrice the bottomPrice to set
	 */
	public void setBottomPrice(float bottomPrice) {
		this.bottomPrice = bottomPrice;
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

	/**
	 * @return the hsnNo
	 */
	public String getHsnNo() {
		return hsnNo;
	}

	/**
	 * @param hsnNo the hsnNo to set
	 */
	public void setHsnNo(String hsnNo) {
		this.hsnNo = hsnNo;
	}

	/**
	 * @return the invoiceDate
	 */
	public String getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the gstPer
	 */
	public float getGstPer() {
		return gstPer;
	}

	/**
	 * @param gstPer the gstPer to set
	 */
	public void setGstPer(float gstPer) {
		this.gstPer = gstPer;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ItemWithType [itemId=" + itemId + ", itemName=" + itemName + ", vendorId=" + vendorId + ", typeId="
				+ typeId + ", designNo=" + designNo + ", itemSize=" + itemSize + ", itemQuantity=" + itemQuantity
				+ ", bottomPrice=" + bottomPrice + ", itemPrice=" + itemPrice + ", hsnNo=" + hsnNo + ", invoiceDate="
				+ invoiceDate + ", poId=" + poId + ", gstPer=" + gstPer + ", status=" + status + ", isUsed=" + isUsed
				+ ", itemType=" + itemType + "]";
	}

	
	

}
