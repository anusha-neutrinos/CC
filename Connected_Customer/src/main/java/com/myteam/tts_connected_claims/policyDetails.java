package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class policyDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("policyNumber")
	private java.lang.String policyNumber;

	@org.kie.api.definition.type.Label("policyBrand")
	private java.lang.String policyBrand;

	@org.kie.api.definition.type.Label("policyStatus")
	private java.lang.String policyStatus;

	@org.kie.api.definition.type.Label("policyHolderFirstName")
	private java.lang.String policyHolderFirstName;

	@org.kie.api.definition.type.Label("policyHolderSurname")
	private java.lang.String policyHolderSurname;

	@org.kie.api.definition.type.Label("policyHolderInitials")
	private java.lang.String policyHolderInitials;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("members")
	private java.util.List<com.myteam.tts_connected_claims.members> members;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("vehicles")
	private java.util.List<com.myteam.tts_connected_claims.vehicles> vehicles;

	@org.kie.api.definition.type.Label("id")
	private java.lang.String id;

	@org.kie.api.definition.type.Label("email")
	private java.lang.String email;

	@org.kie.api.definition.type.Label("contactNumber")
	private java.lang.String contactNumber;

	@org.kie.api.definition.type.Label("dateOfBirth")
	private java.lang.String dateOfBirth;

	@org.kie.api.definition.type.Label("policyInactiveReason")
	private java.lang.String policyInactiveReason;

	@org.kie.api.definition.type.Label("policyCancellationDate")
	private java.lang.String policyCancellationDate;

	@org.kie.api.definition.type.Label("policyCancellationReason")
	private java.lang.String policyCancellationReason;

	@org.kie.api.definition.type.Label("policyCommencementTime")
	private java.lang.String policyCommencementTime;

	@org.kie.api.definition.type.Label("policyCommencementDate")
	private java.lang.String policyCommencementDate;

	@org.kie.api.definition.type.Label("riskAddress")
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private riskAddress riskAddress;

	@org.kie.api.definition.type.Label(value = "brokerDescription")
	private java.lang.String brokerDescription;

	@org.kie.api.definition.type.Label(value = "brokerCode")
	private java.lang.String brokerCode;

	public policyDetails() {
	}

	public java.lang.String getPolicyNumber() {
		return this.policyNumber;
	}

	public void setPolicyNumber(java.lang.String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public java.lang.String getPolicyBrand() {
		return this.policyBrand;
	}

	public void setPolicyBrand(java.lang.String policyBrand) {
		this.policyBrand = policyBrand;
	}

	public java.lang.String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(java.lang.String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public java.lang.String getPolicyHolderFirstName() {
		return this.policyHolderFirstName;
	}

	public void setPolicyHolderFirstName(java.lang.String policyHolderFirstName) {
		this.policyHolderFirstName = policyHolderFirstName;
	}

	public java.lang.String getPolicyHolderSurname() {
		return this.policyHolderSurname;
	}

	public void setPolicyHolderSurname(java.lang.String policyHolderSurname) {
		this.policyHolderSurname = policyHolderSurname;
	}

	public java.lang.String getPolicyHolderInitials() {
		return this.policyHolderInitials;
	}

	public void setPolicyHolderInitials(java.lang.String policyHolderInitials) {
		this.policyHolderInitials = policyHolderInitials;
	}

	public java.util.List<com.myteam.tts_connected_claims.members> getMembers() {
		return this.members;
	}

	public void setMembers(
			java.util.List<com.myteam.tts_connected_claims.members> members) {
		this.members = members;
	}

	public java.util.List<com.myteam.tts_connected_claims.vehicles> getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(
			java.util.List<com.myteam.tts_connected_claims.vehicles> vehicles) {
		this.vehicles = vehicles;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(java.lang.String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public java.lang.String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(java.lang.String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public java.lang.String getPolicyInactiveReason() {
		return this.policyInactiveReason;
	}

	public void setPolicyInactiveReason(java.lang.String policyInactiveReason) {
		this.policyInactiveReason = policyInactiveReason;
	}

	public java.lang.String getPolicyCancellationDate() {
		return this.policyCancellationDate;
	}

	public void setPolicyCancellationDate(
			java.lang.String policyCancellationDate) {
		this.policyCancellationDate = policyCancellationDate;
	}

	public java.lang.String getPolicyCancellationReason() {
		return this.policyCancellationReason;
	}

	public void setPolicyCancellationReason(
			java.lang.String policyCancellationReason) {
		this.policyCancellationReason = policyCancellationReason;
	}

	public java.lang.String getPolicyCommencementTime() {
		return this.policyCommencementTime;
	}

	public void setPolicyCommencementTime(
			java.lang.String policyCommencementTime) {
		this.policyCommencementTime = policyCommencementTime;
	}

	public java.lang.String getPolicyCommencementDate() {
		return this.policyCommencementDate;
	}

	public void setPolicyCommencementDate(
			java.lang.String policyCommencementDate) {
		this.policyCommencementDate = policyCommencementDate;
	}

	public com.myteam.tts_connected_claims.riskAddress getRiskAddress() {
		return this.riskAddress;
	}

	public void setRiskAddress(
			com.myteam.tts_connected_claims.riskAddress riskAddress) {
		this.riskAddress = riskAddress;
	}

	public java.lang.String getBrokerDescription() {
		return this.brokerDescription;
	}

	public void setBrokerDescription(java.lang.String brokerDescription) {
		this.brokerDescription = brokerDescription;
	}

	public java.lang.String getBrokerCode() {
		return this.brokerCode;
	}

	public void setBrokerCode(java.lang.String brokerCode) {
		this.brokerCode = brokerCode;
	}

	public policyDetails(java.lang.String policyNumber,
			java.lang.String policyBrand, java.lang.String policyStatus,
			java.lang.String policyHolderFirstName,
			java.lang.String policyHolderSurname,
			java.lang.String policyHolderInitials,
			java.util.List<com.myteam.tts_connected_claims.members> members,
			java.util.List<com.myteam.tts_connected_claims.vehicles> vehicles,
			java.lang.String id, java.lang.String email,
			java.lang.String contactNumber, java.lang.String dateOfBirth,
			java.lang.String policyInactiveReason,
			java.lang.String policyCancellationDate,
			java.lang.String policyCancellationReason,
			java.lang.String policyCommencementTime,
			java.lang.String policyCommencementDate,
			com.myteam.tts_connected_claims.riskAddress riskAddress,
			java.lang.String brokerDescription, java.lang.String brokerCode) {
		this.policyNumber = policyNumber;
		this.policyBrand = policyBrand;
		this.policyStatus = policyStatus;
		this.policyHolderFirstName = policyHolderFirstName;
		this.policyHolderSurname = policyHolderSurname;
		this.policyHolderInitials = policyHolderInitials;
		this.members = members;
		this.vehicles = vehicles;
		this.id = id;
		this.email = email;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.policyInactiveReason = policyInactiveReason;
		this.policyCancellationDate = policyCancellationDate;
		this.policyCancellationReason = policyCancellationReason;
		this.policyCommencementTime = policyCommencementTime;
		this.policyCommencementDate = policyCommencementDate;
		this.riskAddress = riskAddress;
		this.brokerDescription = brokerDescription;
		this.brokerCode = brokerCode;
	}

}