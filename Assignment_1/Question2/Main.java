package Question2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many students would you like to grade?: ");
		int numStudents = 0;
		boolean validationNumber = false;
		while (!validationNumber) {
			try {
				numStudents = input.nextInt();
				if (numStudents <= 0) {
					throw new InputMismatchException();
				}
				validationNumber = true;
			} catch (InputMismatchException ex) {
				System.out.println("Please enter positive integer.");
			}
			input.nextLine();
		}
		ArrayList<Student> list = new ArrayList<Student>();
		for (int i = 1; i <= numStudents; i++) {
			System.out.println(i + ". Student's first name: ");
			String firstN = input.next();
			System.out.println(i + ". Student's last name: ");
			String lastN = input.next();
			System.out.println(i + ". Enter student's mark: ");
			int mark = 0;
			boolean validationMark = false;
			while (!validationMark) {
				try {
					mark = input.nextInt();
					if (mark < 0 || mark > 100) {
						throw new InputMismatchException();
					}
					validationMark = true;
				} catch (InputMismatchException ex) {
					System.out.println("Integer between 0-100, please.");
				}
				input.nextLine();
			}

			Student s = new Student(firstN, lastN, mark);
			list.add(s);
		}
		input.close();
		for (Student student : list) {
			System.out.println(student.toString());
		}

	}

}
