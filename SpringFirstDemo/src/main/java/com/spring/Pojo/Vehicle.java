package com.spring.Pojo;

public class Vehicle {
	private String make;
	private Integer year;
	private String color;
	private String model;
	private String vin;
	private String licensePlate;
	
	public Vehicle(String make, Integer year, String color, String model, String vin, String licensePlate) {
		super();
		this.make = make;
		this.year = year;
		this.color = color;
		this.model = model;
		this.vin = vin;
		this.licensePlate = licensePlate;
	}
	public Vehicle() {
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", year=" + year + ", color=" + color + ", model=" + model + ", vin=" + vin
				+ ", licensePlate=" + licensePlate + "]";
	}

}
