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
@Table(name="medicalHistory")
public class MedicalHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int historyId;
	private int age;
	private double height;
	private double weight;
	private String bloodGroup;
	private String details;
	private  boolean existingIllness;
	private boolean surgicalProcedue;
	private int medicalReport;
	
	public MedicalHistory(int historytId, int age,double height, double weight, String bloodGroup, boolean existingIllness, boolean surgicalProcedure, String details,int medicalReport) {
		super();
		this.historyId = historytId;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bloodGroup = bloodGroup;
		this.existingIllness = existingIllness;
		this.surgicalProcedue = surgicalProcedure;
		this.details = details;
		this.medicalReport = medicalReport;
	}
	
	public MedicalHistory() {}

}