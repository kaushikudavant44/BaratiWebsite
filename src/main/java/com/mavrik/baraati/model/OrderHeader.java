package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_bill_header")
public class OrderHeader {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bill_id")
	private int billId;
	 
	@Column(name="bill_no")
	private int billNo;
	
	@Column(name="bill_date")
	private String billDate;

	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_mo")
	private String custMo;
	
	@Column(name="cust_add")
	private String custAdd;
	
	@Column(name="email")
	private String email;
	
	@Column(name="taxable_amt")
	private float taxableAmt;
	
	@Column(name="disc_per")
	private float discPer;
	
	@Column(name="disc_rs")
	private float discRs;
	
	@Column(name="tax_rs")
	private float taxRs;
	
	@Column(name="actual_total")
	private float actualTotal;
	
	@Column(name="rem_amt")
	private float remAmt;
	
	@Column(name="actual_taxrs")
	private float actualTaxrs;
	 
	@Column(name="is_stiching")
	private int isStiching;
	
	@Column(name="adddate_time")
	private String adddateTime;
	
	@Column(name="add_id")
	private int addId;
	
	@Column(name="status")
	private int status;
	
	@Column(name="is_used")
	private int isUsed;

	@Column(name="grand_total")
	private float grandTotal;
	
	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMo() {
		return custMo;
	}

	public void setCustMo(String custMo) {
		this.custMo = custMo;
	}

	public String getCustAdd() {
		return custAdd;
	}

	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getTaxableAmt() {
		return taxableAmt;
	}

	public void setTaxableAmt(float taxableAmt) {
		this.taxableAmt = taxableAmt;
	}

	public float getDiscPer() {
		return discPer;
	}

	public void setDiscPer(float discPer) {
		this.discPer = discPer;
	}

	public float getDiscRs() {
		return discRs;
	}

	public void setDiscRs(float discRs) {
		this.discRs = discRs;
	}

	public float getTaxRs() {
		return taxRs;
	}

	public void setTaxRs(float taxRs) {
		this.taxRs = taxRs;
	}

	public float getActualTotal() {
		return actualTotal;
	}

	public void setActualTotal(float actualTotal) {
		this.actualTotal = actualTotal;
	}

	public float getRemAmt() {
		return remAmt;
	}

	public void setRemAmt(float remAmt) {
		this.remAmt = remAmt;
	}

	public float getActualTaxrs() {
		return actualTaxrs;
	}

	public void setActualTaxrs(float actualTaxrs) {
		this.actualTaxrs = actualTaxrs;
	}

	public int getIsStiching() {
		return isStiching;
	}

	public void setIsStiching(int isStiching) {
		this.isStiching = isStiching;
	}

	public String getAdddateTime() {
		return adddateTime;
	}

	public void setAdddateTime(String adddateTime) {
		this.adddateTime = adddateTime;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
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

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Override
	public String toString() {
		return "OrderHeader [billId=" + billId + ", billNo=" + billNo + ", billDate=" + billDate + ", custName="
				+ custName + ", custMo=" + custMo + ", custAdd=" + custAdd + ", email=" + email + ", taxableAmt="
				+ taxableAmt + ", discPer=" + discPer + ", discRs=" + discRs + ", taxRs=" + taxRs + ", actualTotal="
				+ actualTotal + ", remAmt=" + remAmt + ", actualTaxrs=" + actualTaxrs + ", isStiching=" + isStiching
				+ ", adddateTime=" + adddateTime + ", addId=" + addId + ", status=" + status + ", isUsed=" + isUsed
				+ ", grandTotal=" + grandTotal + "]";
	}
	
	

}
