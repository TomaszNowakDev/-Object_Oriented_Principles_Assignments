package Question3;

public class Person {
	private int stars;
	private String phone;
	private String name;

	public Person(int s, String p, String n) {
		this.setStars(s);
		this.setPhone(p);
		this.setName(n);
	}

	public void jump() {
		System.out.println("I jumped");
	}

	public void jump(int jumps) {
		System.out.println("I jumped " + jumps + " times!");
	}

	public void setStars(int s) {
		this.stars = s;
	}

	public void setPhone(String p) {
		this.phone = p;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getStars() {
		return this.stars;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "Stars: " + this.getStars() + "\nPhone: " + this.getPhone() + "\nName: " + this.getName();
	}

	public void print() {
		System.out.println(this.toString());
	}
}
