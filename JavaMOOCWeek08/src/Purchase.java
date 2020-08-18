
public class Purchase {
	private final String product;
	private int amount;
	private final int unitPrice;
	
	public Purchase(String product, int amount, int unitPrice) {
		this.product = product;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}
	
	public String name() {
		return this.product;
	}
	public int amount() {
		return this.amount;
	}
	
	public int price() {
		return amount * unitPrice;
		
	}
	
	public void increaseAmount() {
		this.amount++;
		
	}
	
	public String toString() {
		return this.product + ": " + this.amount;
		
	}

}
