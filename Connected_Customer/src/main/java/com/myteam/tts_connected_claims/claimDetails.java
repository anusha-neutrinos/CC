package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class claimDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("amount")
	private java.lang.String amount;
	@org.kie.api.definition.type.Label("claimCause")
	private java.lang.String claimCause;
	@org.kie.api.definition.type.Label("claimNumber")
	private java.lang.String claimNumber;
	@org.kie.api.definition.type.Label("claimStatus")
	private java.lang.String claimStatus;
	@org.kie.api.definition.type.Label("claimType")
	private java.lang.String claimType;
	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;
	@org.kie.api.definition.type.Label("incidentDate")
	private java.lang.String incidentDate;
	@org.kie.api.definition.type.Label("policyClaim")
	private java.lang.String policyClaim;
	@org.kie.api.definition.type.Label("riskItem")
	private java.lang.String riskItem;
	@org.kie.api.definition.type.Label("riskItemRequestNumber")
	private java.lang.String riskItemRequestNumber;

	@org.kie.api.definition.type.Label(value = "riskItemSequenceNumber")
	private java.lang.String riskItemSequenceNumber;

	@org.kie.api.definition.type.Label(value = "damageDescription")
	private java.lang.String damageDescription;

	public claimDetails() {
	}

	public java.lang.String getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.String amount) {
		this.amount = amount;
	}

	public java.lang.String getClaimCause() {
		return this.claimCause;
	}

	public void setClaimCause(java.lang.String claimCause) {
		this.claimCause = claimCause;
	}

	public java.lang.String getClaimNumber() {
		return this.claimNumber;
	}

	public void setClaimNumber(java.lang.String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public java.lang.String getClaimStatus() {
		return this.claimStatus;
	}

	public void setClaimStatus(java.lang.String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public java.lang.String getClaimType() {
		return this.claimType;
	}

	public void setClaimType(java.lang.String claimType) {
		this.claimType = claimType;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getIncidentDate() {
		return this.incidentDate;
	}

	public void setIncidentDate(java.lang.String incidentDate) {
		this.incidentDate = incidentDate;
	}

	public java.lang.String getPolicyClaim() {
		return this.policyClaim;
	}

	public void setPolicyClaim(java.lang.String policyClaim) {
		this.policyClaim = policyClaim;
	}

	public java.lang.String getRiskItem() {
		return this.riskItem;
	}

	public void setRiskItem(java.lang.String riskItem) {
		this.riskItem = riskItem;
	}

	public java.lang.String getRiskItemRequestNumber() {
		return this.riskItemRequestNumber;
	}

	public void setRiskItemRequestNumber(java.lang.String riskItemRequestNumber) {
		this.riskItemRequestNumber = riskItemRequestNumber;
	}

	public java.lang.String getRiskItemSequenceNumber() {
		return this.riskItemSequenceNumber;
	}

	public void setRiskItemSequenceNumber(
			java.lang.String riskItemSequenceNumber) {
		this.riskItemSequenceNumber = riskItemSequenceNumber;
	}

	public java.lang.String getDamageDescription() {
		return this.damageDescription;
	}

	public void setDamageDescription(java.lang.String damageDescription) {
		this.damageDescription = damageDescription;
	}

	public claimDetails(java.lang.String amount, java.lang.String claimCause,
			java.lang.String claimNumber, java.lang.String claimStatus,
			java.lang.String claimType, java.lang.String description,
			java.lang.String incidentDate, java.lang.String policyClaim,
			java.lang.String riskItem, java.lang.String riskItemRequestNumber,
			java.lang.String riskItemSequenceNumber,
			java.lang.String damageDescription) {
		this.amount = amount;
		this.claimCause = claimCause;
		this.claimNumber = claimNumber;
		this.claimStatus = claimStatus;
		this.claimType = claimType;
		this.description = description;
		this.incidentDate = incidentDate;
		this.policyClaim = policyClaim;
		this.riskItem = riskItem;
		this.riskItemRequestNumber = riskItemRequestNumber;
		this.riskItemSequenceNumber = riskItemSequenceNumber;
		this.damageDescription = damageDescription;
	}

}