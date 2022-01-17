package Question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a poitive integer: ");
		int bottlesQuantity = 0;
		boolean inputValidation = false;
		while (!inputValidation) {
			try {
				bottlesQuantity = input.nextInt();
				if (bottlesQuantity < 0) {
					throw new InputMismatchException();
				}
				inputValidation = true;
			} catch (InputMismatchException ex) {
				System.out.println("Please enter positive integer.");
			}
			input.nextLine();
		}

		input.close();

		System.out.println("");
		new Song(bottlesQuantity);
	}
}
