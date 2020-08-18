package farmsimulator;
import java.util.*;

public class Farm implements Alive {
	private String owner;
	private Barn barn;
	private List<Cow> herd;
	private MilkingRobot mk;
	
	public Farm(String owner, Barn barn) {
		this.owner = owner;
		this.barn = barn;
		this.herd = new ArrayList<Cow>();
	}
	
	public void installMilkingRobot(MilkingRobot mk) {
		this.mk = mk;
	}
	
	public String getOwner() {
		return owner;
	}

	
	public void addCow(Cow cow) {
		herd.add(cow);
	}
	
	@Override
	public void liveHour() {
		for (Cow cow: herd) {
			cow.liveHour();
		}

	}

	
	public void manageCows() {
		if (mk == null) {
			throw new IllegalStateException("Cant do that");
		}
		for (Cow cow: herd) {
			cow.milk();
		}
	}
	
	public String getCows() {
		String string = "";
		if (herd.isEmpty()) {
			return "No cows.";
		}else {
			for (Cow cow: herd) {
				string += cow;
				string += "\n";
			}
			return string;
		}
	}
	
	
	@Override
	public String toString() {
		return "Farm owner: " + getOwner() + "\n" + "Barn bulk tank: " + barn.toString() + "\n" + getCows();
	}

}
