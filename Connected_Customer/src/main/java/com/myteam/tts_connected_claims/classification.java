package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class classification implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("assessmentClassification")
	private java.lang.String assessmentClassification;
	@org.kie.api.definition.type.Label("assessmentType")
	private java.lang.String assessmentType;
	@org.kie.api.definition.type.Label("assessmentTypeDescription")
	private java.lang.String assessmentTypeDescription;
	@org.kie.api.definition.type.Label("claimCategory")
	private java.lang.String claimCategory;

	@org.kie.api.definition.type.Label(value = "requestType")
	private java.util.List<java.lang.String> requestType;

	@org.kie.api.definition.type.Label(value = "subCategory")
	private java.util.List<java.lang.String> subCategory;

	public classification() {
	}

	public java.lang.String getAssessmentClassification() {
		return this.assessmentClassification;
	}

	public void setAssessmentClassification(
			java.lang.String assessmentClassification) {
		this.assessmentClassification = assessmentClassification;
	}

	public java.lang.String getAssessmentType() {
		return this.assessmentType;
	}

	public void setAssessmentType(java.lang.String assessmentType) {
		this.assessmentType = assessmentType;
	}

	public java.lang.String getAssessmentTypeDescription() {
		return this.assessmentTypeDescription;
	}

	public void setAssessmentTypeDescription(
			java.lang.String assessmentTypeDescription) {
		this.assessmentTypeDescription = assessmentTypeDescription;
	}

	public java.lang.String getClaimCategory() {
		return this.claimCategory;
	}

	public void setClaimCategory(java.lang.String claimCategory) {
		this.claimCategory = claimCategory;
	}

	public java.util.List<java.lang.String> getRequestType() {
		return this.requestType;
	}

	public void setRequestType(java.util.List<java.lang.String> requestType) {
		this.requestType = requestType;
	}

	public java.util.List<java.lang.String> getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(java.util.List<java.lang.String> subCategory) {
		this.subCategory = subCategory;
	}

	public classification(java.lang.String assessmentClassification,
			java.lang.String assessmentType,
			java.lang.String assessmentTypeDescription,
			java.lang.String claimCategory,
			java.util.List<java.lang.String> requestType,
			java.util.List<java.lang.String> subCategory) {
		this.assessmentClassification = assessmentClassification;
		this.assessmentType = assessmentType;
		this.assessmentTypeDescription = assessmentTypeDescription;
		this.claimCategory = claimCategory;
		this.requestType = requestType;
		this.subCategory = subCategory;
	}

}