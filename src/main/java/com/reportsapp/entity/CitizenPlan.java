package com.reportsapp.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name ="CITIZEN_PLANS_INFO")
public class CitizenPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citizenId;

    private String citizenName;
    private String gender;
    private String planName;
    private String planStatus;
    private LocalDate planStartDate;
    private LocalDate planEndDate;
    private Double benefitAmt;
    private String denialReson;
    private LocalDate terminateDate;
    private String terminationReason;
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public Double getBenefitAmt() {
		return benefitAmt;
	}
	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}
	public String getDenialReson() {
		return denialReson;
	}
	public void setDenialReson(String denialReson) {
		this.denialReson = denialReson;
	}
	public LocalDate getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(LocalDate terminateDate) {
		this.terminateDate = terminateDate;
	}
	public String getTerminationReason() {
		return terminationReason;
	}
	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}
    
}