import java.util.*;

public class Team {
	
	private String name;
	private int maxSize = 16;
	private ArrayList<Player> list = new ArrayList<Player>();
	
	public Team(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPlayer(Player player) {
		if (list.size() < maxSize) {
		list.add(player);
		}	
	}
	
	public void printPlayers() {
		for(Player player: list) {
			System.out.println(player);
		}	
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public int size() {
		return  list.size();
	}
	
	public int goals() {
		int goals = 0;
		for (Player player: list) {
			goals += player.goals();
		}
		return goals;
	}
}