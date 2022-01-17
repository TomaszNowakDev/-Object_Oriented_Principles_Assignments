package Question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many students would you like to grade?: ");
		int numStudents = 0;
		boolean validationNumber = false;
		while (!validationNumber) {
			try {
				numStudents = scanner.nextInt();
				if (numStudents <= 0) {
					throw new InputMismatchException();
				}
				validationNumber = true;
			} catch (InputMismatchException ex) {
				System.out.println("Please enter positive integer.");
			}
			scanner.nextLine();
		}

		scanner.close();

	}

}
