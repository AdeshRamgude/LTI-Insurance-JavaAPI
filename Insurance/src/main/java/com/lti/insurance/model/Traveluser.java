package com.lti.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traveluser")
public class Traveluser {
	@Id
	private int linkid;
	private String policyno;
	private int userid;
	public int getLinkid() {
		return linkid;
	}
	public void setLinkid(int linkid) {
		this.linkid = linkid;
	}
	public String getPolicyno() {
		return policyno;
	}
	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Traveluser(int linkid, String policyno, int userid) {
		super();
		this.linkid = linkid;
		this.policyno = policyno;
		this.userid = userid;
	}
	public Traveluser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Traveluser [linkid=" + linkid + ", policyno=" + policyno + ", userid=" + userid + "]";
	}
}
