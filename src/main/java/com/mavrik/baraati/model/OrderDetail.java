package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="t_bill_detail")
public class OrderDetail {
 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bill_detail_id")
	private int billDetailId;
	
	@Column(name="bill_id")
	private int billId;
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_qty")
	private float itemQty;

	@Column(name="mrp")
	private float mrp;
	
	@Column(name="stitching_amt")
	private float stitchingAmt;
	
	@Column(name="actual_taxable_amt")
	private float actualTaxableAmt;
	
	@Column(name="actual_tax_amt")
	private float actualTaxAmt;
	
	@Column(name="taxable_amt")
	private float taxableAmt;
	
	@Column(name="disc_amt")
	private float discAmt;
	
	@Column(name="tax_amt")
	private float taxAmt;
	
	@Column(name="tax_per")
	private float taxPer;
	
	@Column(name="grand_total")
	private float grandTotal;
	
	@Column(name="status")
	private int status;
	
	@Column(name="is_used")
	private int isUsed;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="is_stiching")
	private int isStiching;
	
	@Transient
	private String itemName;

	public int getBillDetailId() {
		return billDetailId;
	}

	public void setBillDetailId(int billDetailId) {
		this.billDetailId = billDetailId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public float getItemQty() {
		return itemQty;
	}

	public void setItemQty(float itemQty) {
		this.itemQty = itemQty;
	}

	public float getMrp() {
		return mrp;
	}

	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	public float getActualTaxAmt() {
		return actualTaxAmt;
	}

	public void setActualTaxAmt(float actualTaxAmt) {
		this.actualTaxAmt = actualTaxAmt;
	}

	public float getTaxableAmt() {
		return taxableAmt;
	}

	public void setTaxableAmt(float taxableAmt) {
		this.taxableAmt = taxableAmt;
	}

	public float getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(float discAmt) {
		this.discAmt = discAmt;
	}

	public float getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(float taxAmt) {
		this.taxAmt = taxAmt;
	}

	public float getTaxPer() {
		return taxPer;
	}

	public void setTaxPer(float taxPer) {
		this.taxPer = taxPer;
	}

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getActualTaxableAmt() {
		return actualTaxableAmt;
	}

	public void setActualTaxableAmt(float actualTaxableAmt) {
		this.actualTaxableAmt = actualTaxableAmt;
	}

	public float getStitchingAmt() {
		return stitchingAmt;
	}

	public void setStitchingAmt(float stitchingAmt) {
		this.stitchingAmt = stitchingAmt;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getIsStiching() {
		return isStiching;
	}

	public void setIsStiching(int isStiching) {
		this.isStiching = isStiching;
	}

	@Override
	public String toString() {
		return "OrderDetail [billDetailId=" + billDetailId + ", billId=" + billId + ", itemId=" + itemId + ", itemQty="
				+ itemQty + ", mrp=" + mrp + ", stitchingAmt=" + stitchingAmt + ", actualTaxableAmt=" + actualTaxableAmt
				+ ", actualTaxAmt=" + actualTaxAmt + ", taxableAmt=" + taxableAmt + ", discAmt=" + discAmt + ", taxAmt="
				+ taxAmt + ", taxPer=" + taxPer + ", grandTotal=" + grandTotal + ", status=" + status + ", isUsed="
				+ isUsed + ", remark=" + remark + ", isStiching=" + isStiching + ", itemName=" + itemName + "]";
	}
	
	  
}
