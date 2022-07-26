package com.ssproject2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
	@Column
	@NotBlank
	private String username;
	@Column(name = "hasplan01")
	private boolean hasplan01;
	@Column
	private boolean hasplan02;
	@Column
	private boolean hasplan03;
	

	public User(User user) {
		this.pk_id = user.getPk_id();
		this.username = user.getUsername();
		this.hasplan01 = user.isHasplan01();
		this.hasplan02 = user.isHasplan02();
		this.hasplan03 = user.isHasplan03();
	}


	public User(int pk_id, @NotBlank String username, boolean hasplan01, boolean hasplan02, boolean hasplan03) {
		super();
		this.pk_id = pk_id;
		this.username = username;
		this.hasplan01 = hasplan01;
		this.hasplan02 = hasplan02;
		this.hasplan03 = hasplan03;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPk_id() {
		return pk_id;
	}


	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public boolean isHasplan01() {
		return hasplan01;
	}


	public void setHasplan01(boolean hasplan01) {
		this.hasplan01 = hasplan01;
	}


	public boolean isHasplan02() {
		return hasplan02;
	}


	public void setHasplan02(boolean hasplan02) {
		this.hasplan02 = hasplan02;
	}


	public boolean isHasplan03() {
		return hasplan03;
	}


	public void setHasplan03(boolean hasplan03) {
		this.hasplan03 = hasplan03;
	}


	
	
}
