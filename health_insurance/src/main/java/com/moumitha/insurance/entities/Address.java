package com.moumitha.insurance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="address")
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer address_id;
	private int doorNo;
	private String street;
	private String city;
	private String district;
	private String state;
	private int pincode;
	public Address(Integer address_id, int doorNo, String street, String city, String district, String state, int pincode) {
		super();
		this.address_id = address_id;
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {}
}
