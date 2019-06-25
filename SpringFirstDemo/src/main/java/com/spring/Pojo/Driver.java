package com.spring.Pojo;

public class Driver {
	private Integer id;
	private String name;
	private String email;
	private Vehicle vehicle;
	
	public Driver(Integer id, String name, String email, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.vehicle = vehicle;
	}
	public Driver() {
		
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", email=" + email + ", vehicle=" + vehicle + "]";
	}

	
}
