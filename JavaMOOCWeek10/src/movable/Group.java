package movable;

import java.util.*;

public class Group implements Movable {
	
	private List<Movable> list = new ArrayList<Movable>();

	@Override
	public void move(int dx, int dy) {
		for (Movable movable: list) {
			movable.move(dx, dy);
		}

	}
	
	public void addToGroup(Movable movable) {
		this.list.add(movable);
	}

	public String toString() {
		String string = "";
		for(Movable movable: this.list) {
			string += movable.toString();
			string += "\n";
		}
		return string;
	}
}
