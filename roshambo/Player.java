package roshambo;

public abstract class Player {

	private String name;
	private Roshambo choice;

	public Player() {}

	public Player(String name, Roshambo choice) {
		super();
		this.name = name;
		this.choice = choice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract Roshambo generateRoshambo();
}
