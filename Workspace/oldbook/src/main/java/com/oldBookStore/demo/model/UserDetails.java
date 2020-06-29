package com.oldBookStore.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	private int	user_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="mobile_number")
	private String mobile_number;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
//	@Column(name="address_id")
//	private String address_id;
	
	@Column(name="role")
	private String role;
	
	@Column(name="employee_catagory" )
	private boolean employee_catagory;
	
	public UserDetails() {
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getAddress_id() {
//		return address_id;
//	}
//
//	public void setAddress_id(String address_id) {
//		this.address_id = address_id;
//	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean getEmployee_catagory() {
		return employee_catagory;
	}

	public void setEmployee_catagory(boolean employee_catagory) {
		this.employee_catagory = employee_catagory;
	}

	@Override
	public String toString() {
		return "UserDetails [user_id=" + user_id + ", user_name=" + user_name + ", first_name=" + first_name
				+ ", last_name1=" + last_name + ", mobile_number=" + mobile_number + ", email=" + email + ", password="
				+ password +  ", role=" + role + ", employee_catagory="
				+ employee_catagory + "]";
	}
	
	
//	@OneToMany(mappedBy = "address_mapping", cascade = CascadeType.ALL)
//    private Set<Address> address0bj;
//
//	public Set<Address> getAddress0bj() {
//		return address0bj;
//	}
//
//	public void setAddress0bj(Set<Address> address0bj) {
//		this.address0bj = address0bj;
//	}



	
	

}
