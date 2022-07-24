package com.ssproject2.beans;

@Entity
@Table(name = "users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
	@Column
	@NotBlank
	private String username;
	@Column
	private boolean hasplan_01;
	@Column
	private boolean hasplan_02;
	@Column
	private boolean hasplan_03;
	
	
	public User() {
		super();
	}


	public User(int pk_id, String username, boolean hasplan_01, boolean hasplan_02, boolean hasplan_03) {
		super();
		this.pk_id = pk_id;
		this.username = username;
		this.hasplan_01 = hasplan_01;
		this.hasplan_02 = hasplan_02;
		this.hasplan_03 = hasplan_03;
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
	public boolean isHasplan_01() {
		return hasplan_01;
	}
	public void setHasplan_01(boolean hasplan_01) {
		this.hasplan_01 = hasplan_01;
	}
	public boolean isHasplan_02() {
		return hasplan_02;
	}
	public void setHasplan_02(boolean hasplan_02) {
		this.hasplan_02 = hasplan_02;
	}
	public boolean isHasplan_03() {
		return hasplan_03;
	}
	public void setHasplan_03(boolean hasplan_03) {
		this.hasplan_03 = hasplan_03;
	}


	@Override
	public String toString() {
		return "User [pk_id=" + pk_id + ", username=" + username + ", hasplan_01=" + hasplan_01 + ", hasplan_02="
				+ hasplan_02 + ", hasplan_03=" + hasplan_03 + "]";
	}

	
}
