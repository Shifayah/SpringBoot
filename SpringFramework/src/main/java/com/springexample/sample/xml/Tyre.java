package com.springexample.sample.xml;

public class Tyre {
	
	private String number;
	
	public Tyre(String number) {
		super();
		this.number = number;
	}

	// Encapsulation
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [number=" + number + ", brand=" + brand + "]";
	}
}
