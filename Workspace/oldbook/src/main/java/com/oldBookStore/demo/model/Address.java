package com.oldBookStore.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	private int id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="district")
	private String district;
	
	@Column(name="postal_code")
	private String postal_code;
	
	@Column(name="location")
	private String location;
	
	@Column(name="state")
	private String 	state;

	public Address() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int address_id) {
		this.id = address_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + id + ", address=" + address + ", address2=" + address2 + ", district="
				+ district + ", postal_code=" + postal_code + ", location=" + location + ", state=" + state + "]";
	}
	
//	@ManyToOne
//	@JoinColumn(name="address_id")
//	private UserDetails address_mapping;
//
//	public UserDetails getAddress_mapping() {
//		return address_mapping;
//	}
//
//	public void setAddress_mapping(UserDetails address_mapping) {
//		this.address_mapping = address_mapping;
//	}
	
	

}
