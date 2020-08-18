import java.util.*;

public class VehicleRegister {
	
	private HashMap<RegistrationPlate, String> register;
	
	public VehicleRegister() {
		this.register = new HashMap<RegistrationPlate, String>();
	}
	
	public boolean add(RegistrationPlate plate, String owner) {
		if (register.containsKey(plate)) {
			return false;
		}else {
			register.put(plate, owner);
			return true;
		}
	}
	
	public String get(RegistrationPlate plate) {
		if (register.containsKey(plate)) {
			return register.get(plate);
		}else {
			return null;
		}
	}
	
	public boolean delete(RegistrationPlate plate) {
		if (register.containsKey(plate)) {
			register.remove(plate);
			return true;
		}
		return false;
	}
	
	public void printRegistrationPlates() {
		for (RegistrationPlate plate: register.keySet()) {
			System.out.println(plate);
		}
	}
	
	public void printOwners() {
		ArrayList<String> ownerList = new ArrayList<String>();
	        
		for (String owner : register.values()) {
			if (!ownerList.contains(owner)) {
				ownerList.add(owner);
				System.out.println(owner);
			}
		}
	}
}
