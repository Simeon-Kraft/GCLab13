package roshambo;

import java.util.Scanner;

public class Validator {

	Scanner scnr = new Scanner(System.in);

	public static String getRoshambo(Scanner scnr) {
		
		System.out.println("Enter your choice of rock, paper, or scissors: ");
		String input = scnr.nextLine();
		
		while (!input.equalsIgnoreCase("rock") && !input.equalsIgnoreCase("paper") && !input.equalsIgnoreCase("scissors")) {
			System.out.println("Invalid option. Please choose rock, paper, or scissors: ");
			input = scnr.nextLine();
		}
		return input;
	}
	
	public static String getName(Scanner scnr) {
		
		System.out.println("Enter your name, O valient warrior!");
		String name = scnr.nextLine();
		while(!name.matches("[a-zA-Z]")) {
			System.out.println("Please enter an intelligible name: ");
			name = scnr.nextLine();
		}
		
		return name;
	}
	
}
