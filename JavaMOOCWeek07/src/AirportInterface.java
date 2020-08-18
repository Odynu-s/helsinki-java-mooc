import java.util.*;

public class AirportInterface {
	
	private ArrayList<Airplane> planelist;
	private ArrayList<Flight> flightlist;
	private Scanner reader;
	
	public AirportInterface(Scanner reader) {
		this.planelist = new ArrayList<Airplane>();
		this.flightlist = new ArrayList<Flight>();
		this.reader = reader;
	}
	
	public void AirportPanel() {
		System.out.println("Airport panel\n"
				+ "--------------------");
		String command;
		while (true) {
			System.out.println("Choose operation:\n"
					+ "[1] Add airplane\n"
					+ "[2] Add flight\n"
					+ "[x] Exit");
			command = reader.nextLine();
			if (command.equals("1")) {
				addPlane();
			} else if (command.equals("2")) {
				addFlight();
			} else if (command.equals("x")) {
				break;
			} else {
				System.out.println("Invalid command. Please try again.");
			}
		}
		System.out.println("Flight servece\n"
				+ "------------");
		while (true) {
			System.out.println("Choose operation:\n"
					+ "[1] Print planes\n"
					+ "[2] Print flights\n"
					+ "[3] Print plane info\n"
					+ "[x] Quit");
			command = reader.nextLine();
			if (command.equals("1")) {
				printPlanes();
			} else if (command.equals("2")) {
				printFlights();
			} else if (command.equals("3")) {
				printPlaneInfo();
			} else if (command.equals("x")) {
				break;
			} else {
				System.out.println("Invalid  command. Please try again.");
			}
		}
	}
	
	public void addPlane() {
		System.out.println("Give plane ID:");
		String tempID = reader.nextLine();
		System.out.println("Give plane capacity:");
		int capacity = Integer.parseInt(reader.nextLine());
		planelist.add(new Airplane(tempID, capacity));
	}
	
	public void addFlight() {
		System.out.println("Give plane ID:");
		String tempID = reader.nextLine();
		for (Airplane plane: planelist) {
			if (plane.getId().equals(tempID)) {
				System.out.println("Give departure airport code:");
				String temp1 = reader.nextLine();
				System.out.println("Give destination airport code:");
				String temp2 = reader.nextLine();
				flightlist.add(new Flight(plane, temp1, temp2));
			}
		}	
	}
	
	public void printPlanes() {
		for (Airplane plane: planelist) {
			System.out.println(plane);
		}
	}
	
	public void printFlights() {
		for (Flight flight: flightlist) {
			System.out.println(flight);
		}
	}
	
	public void printPlaneInfo() {
		System.out.println("Give plane ID:");
		String tempplaneid = reader.nextLine();
		for (Airplane plane: planelist) {
			if (plane.getId().equals(tempplaneid)){
				System.out.println(plane);
			}
		}
		
	}
}