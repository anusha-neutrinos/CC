package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class driverDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "driverName")
	private java.lang.String driverName;
	@org.kie.api.definition.type.Label(value = "vehicleMileage")
	private java.lang.String vehicleMileage;
	@org.kie.api.definition.type.Label(value = "vehicleDamageArea")
	private java.lang.String vehicleDamageArea;
	@org.kie.api.definition.type.Label(value = "vehicleDriven")
	private java.lang.String vehicleDriven;

	public driverDetails() {
	}

	public java.lang.String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(java.lang.String driverName) {
		this.driverName = driverName;
	}

	public java.lang.String getVehicleMileage() {
		return this.vehicleMileage;
	}

	public void setVehicleMileage(java.lang.String vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public java.lang.String getVehicleDamageArea() {
		return this.vehicleDamageArea;
	}

	public void setVehicleDamageArea(java.lang.String vehicleDamageArea) {
		this.vehicleDamageArea = vehicleDamageArea;
	}

	public java.lang.String getVehicleDriven() {
		return this.vehicleDriven;
	}

	public void setVehicleDriven(java.lang.String vehicleDriven) {
		this.vehicleDriven = vehicleDriven;
	}

	public driverDetails(java.lang.String driverName,
			java.lang.String vehicleMileage,
			java.lang.String vehicleDamageArea, java.lang.String vehicleDriven) {
		this.driverName = driverName;
		this.vehicleMileage = vehicleMileage;
		this.vehicleDamageArea = vehicleDamageArea;
		this.vehicleDriven = vehicleDriven;
	}

}