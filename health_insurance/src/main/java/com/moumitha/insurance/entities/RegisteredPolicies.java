package com.moumitha.insurance.entities;

import java.util.ArrayList;
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
@Table(name="registerdPolicies")
public class RegisteredPolicies {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int regPolicyId;
	private String startDate;
	private String endDate;
	private String renewalDate;
	private boolean reminder;
	public RegisteredPolicies(int regPolicyId, String startDate, String endDate, String renewalDate, boolean reminder) {
		super();
		this.regPolicyId = regPolicyId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.renewalDate = renewalDate;
		this.reminder = reminder;
	}
	public RegisteredPolicies() {}
	
	@ManyToOne
    private AvailablePolicies availablePolicy;

    @ManyToOne
    private Nominee nominee;

    @ManyToOne
    private Client client;
    
    @OneToMany(targetEntity=Payment.class, cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();

    @OneToMany(targetEntity=Claim.class, cascade = CascadeType.ALL)
    private List<Claim> claims = new ArrayList<>();
}