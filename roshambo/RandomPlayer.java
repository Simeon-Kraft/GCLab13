package roshambo;

public class RandomPlayer extends Player {

	Roshambo[] randArray = { Roshambo.PAPER, Roshambo.ROCK, Roshambo.SCISSORS };
	int randNum = (int) ((Math.random() * 3 + 1));

	public RandomPlayer() {
	}

	public RandomPlayer(String name, Roshambo choice) {
		super(name, choice);
	}

	@Override
	public Roshambo generateRoshambo() {

		return randArray[randNum - 1];
	}

}
