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
@Table(name="nominee")
public class Nominee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nomineeId;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private int age;
	public Nominee(Integer nomineeId, String firstName, String lastName, String phoneNo, int age) {
		super();
		this.nomineeId = nomineeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.age = age;
	}
	public Nominee() {}
}
