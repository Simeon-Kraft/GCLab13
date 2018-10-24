package roshambo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoshamboApp {

	static List<Player> players = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean play = true;
		int count = -1;
		int wins = 0;
		int oppwins = 0;
		int draws = 0;
			
		greeting(scnr);
		
		while (play) {
			
			opponent(scnr);
			count = battle(scnr);
			players.remove(1);
			
			if (count == 1) {
				wins++;
			}
			else if (count == 0) {
				oppwins++;
			}
			else {
				draws++;
			}

			
			System.out.printf("%-8s %13s %17s", "\nWins", "Losses", "Draws\n");
			System.out.printf("%-9s %11s %17s", "====", "======", "=====\n");
			System.out.printf("%-8d %10d %16d %12s", wins, oppwins, draws, "\n");

			
			System.out.println("Do you want to play again? (yes/no)");
			String again = scnr.nextLine();
			if (!again.equalsIgnoreCase("yes")) {
				play = false;
			}
		}
		System.out.println("Enter Valhalla's embrace, noble warrior.");

	}

	public static int battle(Scanner scnr) {


		Enum u = players.get(0).generateRoshambo();
		Enum v = players.get(1).generateRoshambo();
		System.out.println(players.get(0).getName() + " threw " + u + "!");
		System.out.println(players.get(1).getName() + " threw " + v + "!");

		if (u == v) {
			System.out.println("Its a draw!");
			return -1;
		} else if (u.toString().equalsIgnoreCase("rock") && v.toString().equalsIgnoreCase("scissors")) {
			System.out.println(players.get(0).getName() + " wins!");
			return 1;
		} else if (u.toString().equalsIgnoreCase("rock") && v.toString().equalsIgnoreCase("paper")) {
			System.out.println(players.get(1).getName() + " wins!");
			return 0;
		} else if (u.toString().equalsIgnoreCase("paper") && v.toString().equalsIgnoreCase("rock")) {
			System.out.println(players.get(0).getName() + " wins!");
			return 1;
		} else if (u.toString().equalsIgnoreCase("paper") && v.toString().equalsIgnoreCase("scissors")) {
			System.out.println(players.get(1).getName() + " wins!");
			return 0;
		} else if (u.toString().equalsIgnoreCase("scissors") && v.toString().equalsIgnoreCase("paper")) {
			System.out.println(players.get(0).getName() + " wins!");
			return 1;
		} else  {
			System.out.println(players.get(1).getName() + " wins!");
			return 0;
		}

		

	}

	public static void greeting(Scanner scnr) {
		
		
		System.out.println("Welcome to Rock Paper Scissors! Two will enter; only one will leave!");
		System.out.println("Enter your name, O valient warrior!");
		String name = scnr.nextLine();
		players.add(new UserPlayer(name, Roshambo.PAPER));

	}

	public static void opponent(Scanner scnr) {
		System.out.println("Choose your antagonist! (Enter Brock or Dale)");
		String opp = scnr.nextLine();

		while (!opp.equalsIgnoreCase("Brock") && !opp.equalsIgnoreCase("Dale")) {
			System.out.println("There's no champion here by that name. Choose either Brock or Dale: ");
			opp = scnr.nextLine();
		}

		if (opp.equalsIgnoreCase("Brock")) {
			players.add(new RandomPlayer("Brock", Roshambo.SCISSORS));
		}

		else if (opp.equalsIgnoreCase("Dale")) {
			players.add(new RockPlayer("Dale", Roshambo.ROCK));
		}
	}

}
