package Question3;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person(2, "04856329", "Tom");
		p1.jump();
		p1.jump(17);
		p1.setStars(5);
		p1.setName("John");
		p1.print();
		System.out.println("Hi " +p1.getName());

	}

}
