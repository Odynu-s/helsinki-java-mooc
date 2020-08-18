
public class Calculator {
	private Reader reader;
	int counter;
	int value1;
	int value2;
	
	public Calculator() {
		this.reader = new Reader();
		this.counter = 0;
	}
	
	 public void start() {
	        while (true) {
	            System.out.print("command: ");
	            String command = reader.readString();
	            if (command.equals("end")) {
	                break;
	            }

	            if (command.equals("sum")) {
	                sum();
	            } else if (command.equals("difference")) {
	                difference();
	            } else if (command.equals("product")) {
	                product();
	            }
	        }
	        statistics();
	 }
	 
	 private void sum() {
		 helper();
		 System.out.println("Sum of the values " + (this.value1 + this.value2));
		 this.counter++;
	 }
	 
	 private void difference() {
		 helper();
		 System.out.println("Difference of the values " + (this.value1 - this.value2));
		 this.counter++;
		 	 
	 }
	 
	 private void product() {
		 helper();
		 System.out.println("Product of the values " + (this.value1 * this.value2));
		 this.counter++;
	 }
	 
	 private void statistics() {
		 System.out.println("Calculations done: " + this.counter);
	 }
	 
	 private void helper() {
		 System.out.println("value1: ");
		 this.value1 = reader.readInteger();
		 System.out.println("value2: ");
		 this.value2 = reader.readInteger();
	 }
}
