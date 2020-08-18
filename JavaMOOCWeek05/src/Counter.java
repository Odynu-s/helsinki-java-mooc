
public class Counter {
	
	private int number;
	private boolean check;
	
	
	//constructors
	public Counter(int startingValue, boolean check) {
		this.number = startingValue;
		this.check = check;
		
	}
	
	public Counter(int startingValue) {
		this(startingValue, false);
		
		
	}
	
	public Counter(boolean check) {
		this(0, check);
		
	}
	
	public Counter() {
		this(0, false);
		
	}

	
	
	//methods
	public int value() {
		return this.number;
		
	}
	
	public void increase() {
		this.number++;
		
	}
	
	public void decrease() {
		if(this.number >= 0) {
			this.number--;
		}
		else {
			this.number = 0;
		}	
		
	}
	
	public void increase(int increaseAmount) {
		if(increaseAmount > 0) {
		this.number += increaseAmount;
		}
	}
	
	public void decrease(int decreaseAmount) {
		if(decreaseAmount > 0) {
			if(this.number > decreaseAmount) {
				this.number -= decreaseAmount;
			}
			else {
				this.number = 0;
			}
		}
	}
}
