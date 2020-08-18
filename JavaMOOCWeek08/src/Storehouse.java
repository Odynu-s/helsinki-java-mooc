import java.util.*;

public class Storehouse {
	
	private Map<String, Integer> pricemap;
	private Map<String, Integer> stockmap;
	
	public Storehouse() {
		this.pricemap = new HashMap<String, Integer>();
		this.stockmap = new HashMap<String, Integer>();
	}
	
	public void addProduct(String product, int price, int stock) {
		pricemap.put(product, price);
		stockmap.put(product, stock);
		
	}
	
	public int price(String product) {
		if (pricemap.containsKey(product)) {
			return pricemap.get(product);
		}
		return -99;	
	}
	
	public int stock(String product) {
		if (stockmap.containsKey(product)) {
			return stockmap.get(product);
		}
		return 0;
		
	}
	
	public boolean take(String product) {
		if (stock(product) > 0) {
			stockmap.replace(product, stock(product) - 1);
			return true;
		}
		return false;
	}
	
	public Set<String> products(){
		return pricemap.keySet();
	}

}
