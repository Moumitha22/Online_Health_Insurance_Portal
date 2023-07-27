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
@Table(name="availablePolicies")
public class AvailablePolicies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int policyId;
	private String policyName;
	private int claim;
	private int hospital;
	private int premium;
	private int cover;
	private int policyPrice;
	private int yearAmount1;
	private int yearAmount2;
	private int yearAmount3;
	
	public AvailablePolicies() {}
	
	 public AvailablePolicies(int policyId, String name, int claim, int hospital, int premium, int cover, int policyPrice,
			int yearAmount1, int yearAmount2, int yearAmount3, Company company) {
		super();
		this.policyId = policyId;
		this.policyName = name;
		this.claim = claim;
		this.hospital = hospital;
		this.premium = premium;
		this.cover = cover;
		this.policyPrice = policyPrice;
		this.yearAmount1 = yearAmount1;
		this.yearAmount2 = yearAmount2;
		this.yearAmount3 = yearAmount3;
		this.company = company;
	}

	@ManyToOne
	private Company company;
	 
	@OneToMany(mappedBy = "availablePolicy", cascade = CascadeType.ALL)
    private List<RegisteredPolicies> registeredPolicies;
}
