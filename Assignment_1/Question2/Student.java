package Question2;

public class Student {
	private String firstName;
	private String lastName;
	private int examinationMark;

	public Student(String n, String l, int a) {
		this.setFirstName(n);
		this.setLastName(l);
		this.setExaminationMark(a);
	}

	public void setFirstName(String n) {
		this.firstName = n;
	}

	public void setLastName(String l) {
		this.lastName = l;
	}

	public void setExaminationMark(int i) {
		this.examinationMark = i;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getExaminationMark() {
		return this.examinationMark;
	}

	private String gradeMark() {
		if (this.examinationMark >= 85) {
			return "Distinction";
		} else if (this.examinationMark >= 65) {
			return "Merit";
		} else if (this.examinationMark >= 40) {
			return "Pass";
		} else {
			return "Fail";
		}

	}

	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + " received " + this.gradeMark() + " for his mark of "
				+ this.getExaminationMark() + "%.";
	}
}
