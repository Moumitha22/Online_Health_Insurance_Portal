package com.moumitha.insurance.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="policies")
public class Policies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int policyId;
	private String policyName;
	private int claim;
	private int hospital;
	private int premium;
	private String coverAmount;
	private int policyPrice;
	private int yearAmount1;
	private int yearAmount2;
	private int yearAmount3;
	private String company;
	private String url;
	private String f1;
	private String f2;
	private String f3;
	
	
	public Policies() {}
	
	 public Policies(int policyId, String name, int claim, int hospital, int premium, String cover, int policyPrice,
			int yearAmount1, int yearAmount2, int yearAmount3,String company, String url, String f1,String f2,String f3) {
		super();
		this.policyId = policyId;
		this.policyName = name;
		this.claim = claim;
		this.hospital = hospital;
		this.premium = premium;
		this.coverAmount = cover;
		this.policyPrice = policyPrice;
		this.yearAmount1 = yearAmount1;
		this.yearAmount2 = yearAmount2;
		this.yearAmount3 = yearAmount3;
		this.company = company;
		this.url = url;
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}
;
}
