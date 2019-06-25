package com.mavrik.baraati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_gst")
public class Gst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gst_id")
	private int gstId;
	
	@Column(name="c_gst")
	private String cGst;
	
	@Column(name="iGst")
	private String iGst;
	
	@Column(name="s_gst")
	private String sGst;

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

	/**
	 * @return the cGst
	 */
	public String getcGst() {
		return cGst;
	}

	/**
	 * @param cGst the cGst to set
	 */
	public void setcGst(String cGst) {
		this.cGst = cGst;
	}

	/**
	 * @return the iGst
	 */
	public String getiGst() {
		return iGst;
	}

	/**
	 * @param iGst the iGst to set
	 */
	public void setiGst(String iGst) {
		this.iGst = iGst;
	}

	/**
	 * @return the sGst
	 */
	public String getsGst() {
		return sGst;
	}

	/**
	 * @param sGst the sGst to set
	 */
	public void setsGst(String sGst) {
		this.sGst = sGst;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gst [gstId=" + gstId + ", cGst=" + cGst + ", iGst=" + iGst + ", sGst=" + sGst + "]";
	}
	
}
