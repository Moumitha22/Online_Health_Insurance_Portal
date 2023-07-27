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
@Table(name="payment")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentId;
	private int amount;
	private String method;
	private String date;
	private String status;
	public Payment(int paymentId, int amount, String method, String date, String status) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.method = method;
		this.date = date;
		this.status = status;
	}
	
	public Payment() {}
}
