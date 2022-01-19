package question2;

public class Film implements Cloneable {

	private String name;
	private String code = "";

	public Film(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getCode() {
		String[] stripped = this.name.split("\\s+");
		for (int i = 0; i <= stripped.length - 1; i++) {
			this.code += stripped[i].substring(0, 1);
		}
		return this.code;
	}

	public String toString() {
		return this.name;
	}

	public void print() {
		System.out.println(toString());
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
