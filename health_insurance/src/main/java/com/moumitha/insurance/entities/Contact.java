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
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contactId;
	private String phoneNumber;
	private String emergencyPhoneNumber;
	private String email;
	public Contact(int conatctId, String phoneNo, String emergencyPhoneNo, String email) {
		super();
		this.contactId = conatctId;
		this.phoneNumber = phoneNo;
		this.emergencyPhoneNumber = emergencyPhoneNo;
		this.email = email;
	}
	public Contact() {}
}
