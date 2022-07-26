package com.ssproject2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "phone_numbers")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneid;
	@Column(name = "phone_num")
	@NotBlank
	private String phone_num;
	@Column
	private boolean isAssigned;
	@Column
	private int userId;
	@Column
	private String device;
	
	
	public Device(int phoneid, @NotBlank String phone_num, boolean isAssigned, int userId, String device) {
		super();
		this.phoneid = phoneid;
		this.device = device;
		this.phone_num = phone_num;
		this.isAssigned = isAssigned;
		this.userId = userId;
		
	}


	public String getDevice() {
		return device;
	}


	public void setDevice(String device) {
		this.device = device;
	}


	public Device() {
		super();
	}


	public Device(Device device) {
		this.phoneid = device.getPhoneid();
		this.device = device.getDevice();
		this.phone_num = device.getPhone_num();
		this.isAssigned = device.isAssigned();
		this.userId = device.getUserId();
	}



	public String getPhone_num() {
		return phone_num;
	}


	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}


	public boolean isAssigned() {
		return isAssigned;
	}


	public void setAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
	}


	public int getPhoneid() {
		return phoneid;
	}


	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}



	
	
	
}
