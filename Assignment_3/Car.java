package oop3;

public class Car extends Vehicle {

	private String colour;
	private Engine engine;
	private Wheel wheel;

	public Car(String n, Engine e, Wheel w) {
		super(n);
		this.engine = e;
		this.wheel = w;

	public void setName(String n) {
		this.name = n;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public String getName() {
		return super.name;
	}

	public Engine getEngine() {
		return engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public String getColour() {
		return colour;
	}

	public void describe() {
		super.describe();
		System.out.println("This is a car, it has engine " + this.engine.getSize() + " liters. Made by "
				+ this.engine.getBrand() + ". It has " + this.wheel.getSize() + " inches wheels," + " Made by "
				+ this.wheel.getBrand() + ".\n");
	}

}
