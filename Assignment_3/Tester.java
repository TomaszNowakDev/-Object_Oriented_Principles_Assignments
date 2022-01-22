package oop3;

public class Tester {
	public static void main(String[] args) {

		// creating an Object c being blueprint of Car with values
		Car c = new Car("Mustang", new Engine(6, "Ford"), new Wheel(18, "Pirelli"));

		// setting fuel of Car c
		c.setFuel("Petrol");

		// creating an object b being blueprint of bicycle with values
		Bicycle b = new Bicycle("Merida", new Wheel(26, "Continental"));

		// calling method describe() on objects c and d
		c.describe();
		b.describe();
	}
}