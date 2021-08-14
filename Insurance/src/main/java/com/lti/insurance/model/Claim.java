package com.lti.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim")
public class Claim {
	@Id
	private int claimid;
	private String type="Travel";
	private String ticketdate;
	private String status;
	private String ticketresolveddate;
	private String policyno;
	private String reason;
	private String userid;
	
	public int getClaimid() {
		return claimid;
	}
	public void setClaimid(int claimid) {
		this.claimid = claimid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTicketdate() {
		return ticketdate;
	}
	public void setTicketdate(String ticketdate) {
		this.ticketdate = ticketdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTicketresolveddate() {
		return ticketresolveddate;
	}
	public void setTicketresolveddate(String ticketresolveddate) {
		this.ticketresolveddate = ticketresolveddate;
	}
	public String getPolicyno() {
		return policyno;
	}
	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Claim(int claimid, String type, String ticketdate, String status, String ticketresolveddate,
			String policyno, String reason,String userid) {
		super();
		this.claimid = claimid;
		this.type = type;
		this.ticketdate = ticketdate;
		this.status = status;
		this.ticketresolveddate = ticketresolveddate;
		this.policyno = policyno;
		this.reason=reason;
		this.userid=userid;
	}
	
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
