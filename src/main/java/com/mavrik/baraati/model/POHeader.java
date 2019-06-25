/**
 * 
 */
package com.mavrik.baraati.model;

import java.util.Date;

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
@Table(name = "t_po_header")
public class POHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "po_id")
	private int poId;

	@Column(name = "vendor_id")
	private int vendor_id;

	@Column(name = "po_created_date")
	private Date po_created_date;

	@Column(name = "po_total")
	private float po_total;

	@Column(name = "po_receive_date")
	private Date poReceiveDate;

	@Column(name = "po_status")
	private int poStatus;

	@Column(name = "gst_id")
	private int gstId;

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
	 * @return the vendor_id
	 */
	public int getVendor_id() {
		return vendor_id;
	}

	/**
	 * @param vendor_id the vendor_id to set
	 */
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	/**
	 * @return the po_created_date
	 */
	public Date getPo_created_date() {
		return po_created_date;
	}

	/**
	 * @param po_created_date the po_created_date to set
	 */
	public void setPo_created_date(Date po_created_date) {
		this.po_created_date = po_created_date;
	}

	/**
	 * @return the po_total
	 */
	public float getPo_total() {
		return po_total;
	}

	/**
	 * @param po_total the po_total to set
	 */
	public void setPo_total(float po_total) {
		this.po_total = po_total;
	}

	/**
	 * @return the poReceiveDate
	 */
	public Date getPoReceiveDate() {
		return poReceiveDate;
	}

	/**
	 * @param poReceiveDate the poReceiveDate to set
	 */
	public void setPoReceiveDate(Date poReceiveDate) {
		this.poReceiveDate = poReceiveDate;
	}

	/**
	 * @return the poStatus
	 */
	public int getPoStatus() {
		return poStatus;
	}

	/**
	 * @param poStatus the poStatus to set
	 */
	public void setPoStatus(int poStatus) {
		this.poStatus = poStatus;
	}

	/**
	 * @return the gstId
	 */
	public int getGstId() {
		return gstId;
	}

	/**
	 * @param gstId the gstId to set
	 */
	public void setGstId(int gstId) {
		this.gstId = gstId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "POHeader [poId=" + poId + ", vendor_id=" + vendor_id + ", po_created_date=" + po_created_date
				+ ", po_total=" + po_total + ", poReceiveDate=" + poReceiveDate + ", poStatus=" + poStatus + ", gstId="
				+ gstId + "]";
	}

}
