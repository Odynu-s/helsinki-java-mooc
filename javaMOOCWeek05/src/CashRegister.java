
public class CashRegister {
	
	//values
	
	private double cashInRegister;
	private int economicalSold;
	private int gourmetSold;
	private double eLP = 2.50;
	private double gLP = 4.00;
	
	
	public CashRegister() {
		this.cashInRegister = 1000;
	}
	
	//methods
	
	public double payEconomical(double cashGiven) {
		if (eLP <= cashGiven) {
			this.cashInRegister += eLP;
			this.economicalSold++;
			return (cashGiven - eLP);
		}else {
			return cashGiven;
		}
				
	}
	
	public double payGourmet(double cashGiven) {
		if (gLP <= cashGiven) {
			this.cashInRegister += gLP;
			this.gourmetSold++;
			return (cashGiven - gLP);
		}else {
				return cashGiven;
		}
		
	}

	
	
	public boolean payEconomical(LyyraCard card) {
		if (eLP <= card.balance()) {
			card.pay(eLP);
			this.economicalSold++;
			return true;
			}else {
				return false;
		
		}
		
	}
	
	public boolean payGourmet(LyyraCard card) {
		if (gLP <= card.balance()) {
			card.pay(gLP);
			this.gourmetSold++;
			return true;
			}else {
				return false;
		
		}
		
		
	}

	
	public void loadMoneyToCard(LyyraCard card, double sum) {
		if (sum > 0) {		
			card.loadMoney(sum);
			this.cashInRegister += sum;
		
		}
	}
	public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
	}
}
