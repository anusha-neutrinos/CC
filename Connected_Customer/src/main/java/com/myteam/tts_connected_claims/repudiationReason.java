package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class repudiationReason implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "repudiationArray")
	private java.lang.String repudiationArray;
	@org.kie.api.definition.type.Label(value = "description")
	private java.lang.String description;
	@org.kie.api.definition.type.Label(value = "code")
	private java.lang.String code;

	public repudiationReason() {
	}

	public java.lang.String getRepudiationArray() {
		return this.repudiationArray;
	}

	public void setRepudiationArray(java.lang.String repudiationArray) {
		this.repudiationArray = repudiationArray;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public repudiationReason(java.lang.String repudiationArray,
			java.lang.String description, java.lang.String code) {
		this.repudiationArray = repudiationArray;
		this.description = description;
		this.code = code;
	}

}