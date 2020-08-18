
public class Player {
	private String name;
	private int numberOfGoals;
	
	public Player(String name, int goals) {
		this.name = name;
		this.numberOfGoals = goals;
	}
	
	public Player(String name) {
		this(name, 0);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int goals() {
		return this.numberOfGoals;
	}
	
	public String toString() {
		return "Player: " + this.getName() + "," + " goals " + this.goals();
	}

}
