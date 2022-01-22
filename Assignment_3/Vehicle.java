package oop3;

public class Vehicle {

	protected String name;
	private String fuel;

	public Vehicle(String n) {
		this.name = n;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getFuel() {
		return this.fuel;
	}

	public void describe() {
		System.out
				.println("Vehicle name: " + this.name + ", Fuel: " + (this.fuel != null ? this.fuel : "no fuel") + ".");
	}
}