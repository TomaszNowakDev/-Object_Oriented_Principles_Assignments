package question2;

import java.util.ArrayList;

public class ActorFilmTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		ArrayList<Film> li1 = new ArrayList<Film>();
		Film f1 = new Film("Thor");
		Film f2 = new Film("Avengers");
		Film f3 = new Film("Me, Irena and Me");
		li1.add(f1);
		li1.add(f2);
		li1.add(f3);
		
		for (Film f : li1) {
			System.out.println(f.toString() + ", code: " + f.getCode());
		}

		Actor kate = new Actor("Kate", "New York", 30);
		Actor tom = new Actor("Tom", "Los Angeles", 28);
		
		kate.setFilmList(li1);
		tom.setFilmList(li1);

		ArrayList<Actor> ac2 = new ArrayList<Actor>();
		ac2.add(tom);
		ac2.add(kate);

		for (Actor a : ac2) {
			System.out.println(a.toString());
		}

		Actor x = new Actor("John Rambo", "Hollywood", 75);
		x.setFilmList(li1);
		Actor y = (Actor) x.clone();
		y.getFilmList().remove(0);
		y.getFilmList().add(new Film("Rocky"));
		y.setName("Bobek");

		System.out.println(x);
		System.out.println(y);

	}

}
