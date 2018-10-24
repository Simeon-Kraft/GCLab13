package roshambo;

public class RockPlayer extends Player {

	public RockPlayer() {
	}

	public RockPlayer(String name, Roshambo choice) {
		super(name, choice);
	}

	@Override
	public Roshambo generateRoshambo() {

		return Roshambo.ROCK;
	}

}
