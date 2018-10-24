package roshambo;

public enum Roshambo {
	ROCK, PAPER, SCISSORS;
	
	@Override
	public String toString() {
		if (this == ROCK) {
			return "rock";
		}
		else if (this == PAPER) {
			return "paper";
		}
		else {
			return "scissors";
		}
	}
}

