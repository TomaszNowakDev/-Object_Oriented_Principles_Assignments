package question2;

import java.lang.Cloneable;
import java.util.ArrayList;

public class Actor implements Cloneable {

	private String name;
	private String address;
	private int age;
	private ArrayList<Film> my_Films;

	public Actor() {
		this.my_Films = new ArrayList<Film>();
	}

	public Actor(String name, String address, int age) {
		this();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFilmList(ArrayList<Film> my_Films) {
		this.my_Films = my_Films;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	public ArrayList<Film> getFilmList() {
		return this.my_Films;
	}

	public String toString() {
		String val = this.name + " who's " + this.age + " and lives in " + this.address;
		for (Film f : this.my_Films) {
			val += ", \"" + f.getName() + "\"";
		}
		val += ".";
		return val;
	}

	public void print() {
		System.out.println(toString());
	}

	public Object clone() throws CloneNotSupportedException {
		Actor actor = (Actor) super.clone();
		ArrayList<Film> x = new ArrayList<Film>();
		for (Film f : my_Films)
			x.add((Film) f.clone());
		actor.setFilmList(x);
		return actor;
	}
}