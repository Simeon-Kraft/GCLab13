package roshambo;

import java.util.Scanner;

public class UserPlayer extends Player {
	Scanner scnr = new Scanner(System.in);
	
	
	public UserPlayer() {}
	
	public UserPlayer(String name, Roshambo choice) {
		super(name, choice);
	}
	
	
	@Override
	public Roshambo generateRoshambo() {
		String userChoice = Validator.getRoshambo(scnr);
		return Roshambo.valueOf(userChoice.toUpperCase());
	}
}
