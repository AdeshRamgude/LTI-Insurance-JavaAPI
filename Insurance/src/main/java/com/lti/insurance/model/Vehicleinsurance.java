package com.lti.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicleinsurance")
public class Vehicleinsurance {
	@Id
	private int insuranceid;
	private String policyno;
	private String registrationno;
	private String datebought;
	private String startdate;
	private String enddate;
	private String maker;
	private String model;
	private String chassino;
	private String engineno;
	private String fueltype;
	private String amount;
	private String valid;
	private int userid;
	public int getInsuranceid() {
		return insuranceid;
	}
	public void setInsuranceid(int insuranceid) {
		this.insuranceid = insuranceid;
	}
	public String getPolicyno() {
		return policyno;
	}
	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}
	public String getRegistrationno() {
		return registrationno;
	}
	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}
	public String getDatebought() {
		return datebought;
	}
	public void setDatebought(String datebought) {
		this.datebought = datebought;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getChassino() {
		return chassino;
	}
	public void setChassino(String chassino) {
		this.chassino = chassino;
	}
	public String getEngineno() {
		return engineno;
	}
	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Vehicleinsurance(int insuranceid, String policyno, String registrationno, String datebought,
			String startdate, String enddate, String maker, String model, String chassino, String engineno,
			String fueltype, String amount, String valid, int userid) {
		super();
		this.insuranceid = insuranceid;
		this.policyno = policyno;
		this.registrationno = registrationno;
		this.datebought = datebought;
		this.startdate = startdate;
		this.enddate = enddate;
		this.maker = maker;
		this.model = model;
		this.chassino = chassino;
		this.engineno = engineno;
		this.fueltype = fueltype;
		this.amount = amount;
		this.valid = valid;
		this.userid = userid;
	}
	public Vehicleinsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicleinsurance [insuranceid=" + insuranceid + ", policyno=" + policyno + ", registrationno="
				+ registrationno + ", datebought=" + datebought + ", startdate=" + startdate + ", enddate=" + enddate
				+ ", maker=" + maker + ", model=" + model + ", chassino=" + chassino + ", engineno=" + engineno
				+ ", fueltype=" + fueltype + ", amount=" + amount + ", valid=" + valid + ", userid=" + userid + "]";
	}
	
	
}
