package com.ssproject2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "phone_plans")
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planid;
	
	@Column
	@NotBlank
	private String name;
	
	@Column
	private int price;
	
	@Column(name = "deviceLimit")
	private int deviceLimit;

	
	public Plan() {
		super();
	}
	public Plan ( Plan plan) {
		this.planid = plan.getPlanid();
		this.name = plan.getName();
		this.price = plan.getPrice();
		this.deviceLimit = plan.getDeviceLimit();
	}
	public Plan(int planid, @NotBlank String name, int price, int deviceLimit) {
		super();
		this.planid = planid;
		this.name = name;
		this.price = price;
		this.deviceLimit = deviceLimit;
	}

	public int getPlanid() {
		return planid;
	}

	public void setPlanid(int planid) {
		this.planid = planid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDeviceLimit() {
		return deviceLimit;
	}

	public void setDeviceLimit(int deviceLimit) {
		this.deviceLimit = deviceLimit;
	}
	
	
}
