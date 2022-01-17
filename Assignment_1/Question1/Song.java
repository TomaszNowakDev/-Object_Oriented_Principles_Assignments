package Question1;

public class Song {
	private int bottles;

	public Song() {
		this.bottles = 99;
		this.startSinging();
	}

	public Song(int newBottles) {
		this.bottles = newBottles;
		this.startSinging();
	}

	private void startSinging() {
		while (bottles > 0) {
			System.out.println(this.bottles + " " + this.bottleOrBottles() + " of beer on the wall");
			System.out.println(this.bottles + " " + this.bottleOrBottles() + " of beer");
			System.out.println("Take one down\nPass it around\n");
			this.bottles--;
			System.out.println(this.bottles + " " + this.bottleOrBottles() + " of beer on the wall\n");
		}
	}

	private String bottleOrBottles() {
		return this.bottles == 1 ? "bottle" : "bottles";
	}
}
