package com.moumitha.insurance.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int companyId;
	private String name;
	private int noOfPolicies;
	public Company(int comapnyId, String name, int noOfPolicies) {
		super();
		this.companyId = comapnyId;
		this.name = name;
		this.noOfPolicies = noOfPolicies;
	}
	public Company() {}
	
	 @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	    private List<AvailablePolicies> availablePolicies = new ArrayList<>();
	
}
