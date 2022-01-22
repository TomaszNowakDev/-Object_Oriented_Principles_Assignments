package oop3;

public class Bicycle extends Vehicle {

	private String colour;
	private Wheel wheel;

	public Bicycle(String n, Wheel w) {
		super(n);
		this.wheel = w;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public String getName() {
		return name;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public String getColour() {
		return colour;
	}

	public void describe() {
		super.describe();
		System.out.println("It is a bicycle. It has " + this.wheel.getSize() + " inches wheels," + " Made by "
				+ this.wheel.getBrand() + ".\n");
	}

}
