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
@Table(name="claim")
public class Claim {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int claimId;
	private String date;
	private String status;
	private String details;
	private String claimAmount;
	private String approvedAmount;
	public Claim(int claimId, String date, String status, String details, String claimAmount, String approvedAmount) {
		super();
		this.claimId = claimId;
		this.date = date;
		this.status = status;
		this.details = details;
		this.claimAmount = claimAmount;
		this.approvedAmount = approvedAmount;
	}
	public Claim() {}
	
}