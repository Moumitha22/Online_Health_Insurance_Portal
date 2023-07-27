package com.moumitha.insurance.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int clientId;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String martialStatus;
	private String occupation;
	private int income;
	
	 	@OneToOne(cascade = CascadeType.ALL)
	    private Address address;

	    @OneToOne(cascade = CascadeType.ALL)
	    private Contact contact;

	    @OneToOne(cascade = CascadeType.ALL)
	    private MedicalHistory history;
	    
	    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	    private List<RegisteredPolicies> registeredPolicies;
		public Client(int clientId, String firstName, String lastName, String gender, String dob,String occupation, String martialStatus,int income) {
			super();
			this.clientId = clientId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.dob = dob;
			this.martialStatus = martialStatus;
			this.occupation = occupation;
			this.income = income;
		}
		public Client() {}
}

