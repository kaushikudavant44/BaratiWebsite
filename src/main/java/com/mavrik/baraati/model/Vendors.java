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
@Table(name="m_vendor_details")
public class Vendors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vendor_id", length=11)
	private int vendorId;
	
	@Column(name="vendor_name")
	private String vendorName;
	
	@Column(name="vendor_gst")
	private String vendorGst;
	
	@Column(name="vendor_address")
	private String vendorAddress;
	
	@Column(name="vendor_contact1")
	private String vendorContact1;
	
	@Column(name="vendor_contact2")
	private String vendorContact2;
	
	@Column(name="vendor_email")
	private String vendorEmail;
	
	@Column(name="is_used")
	private int isUsed;

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
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}

	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	/**
	 * @return the vendorGst
	 */
	public String getVendorGst() {
		return vendorGst;
	}

	/**
	 * @param vendorGst the vendorGst to set
	 */
	public void setVendorGst(String vendorGst) {
		this.vendorGst = vendorGst;
	}

	/**
	 * @return the vendorAddress
	 */
	public String getVendorAddress() {
		return vendorAddress;
	}

	/**
	 * @param vendorAddress the vendorAddress to set
	 */
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	/**
	 * @return the vendorContact1
	 */
	public String getVendorContact1() {
		return vendorContact1;
	}

	/**
	 * @param vendorContact1 the vendorContact1 to set
	 */
	public void setVendorContact1(String vendorContact1) {
		this.vendorContact1 = vendorContact1;
	}

	/**
	 * @return the vendorContact2
	 */
	public String getVendorContact2() {
		return vendorContact2;
	}

	/**
	 * @param vendorContact2 the vendorContact2 to set
	 */
	public void setVendorContact2(String vendorContact2) {
		this.vendorContact2 = vendorContact2;
	}

	/**
	 * @return the vendorEmail
	 */
	public String getVendorEmail() {
		return vendorEmail;
	}

	/**
	 * @param vendorEmail the vendorEmail to set
	 */
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	/**
	 * @return the isUsed
	 * 0 = Active User
	 * 1 = Deactive user
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vendors [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorGst=" + vendorGst
				+ ", vendorAddress=" + vendorAddress + ", vendorContact1=" + vendorContact1 + ", vendorContact2="
				+ vendorContact2 + ", vendorEmail=" + vendorEmail + ", isUsed=" + isUsed + "]";
	}
	
	
}
