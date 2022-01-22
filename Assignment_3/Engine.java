package oop3;

public class Engine {

	private int size;
	private String brand;

	public Engine(int s, String b) {
		this.size = s;
		this.brand = b;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public String getBrand() {
		return brand;
	}
}
