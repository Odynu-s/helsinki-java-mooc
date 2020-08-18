package containers;

import java.util.*;

public class ContainerHistory {
	private List<Double> list;
	
	public ContainerHistory() {
		this.list = new ArrayList<Double>();
	}
	
	public void add(double situation) {
		list.add(situation);
	}
	
	public void reset() {
		list.clear();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}

	public double maxValue() {
		if ((!list.isEmpty())) {
			double max = Double.MIN_NORMAL;
			for (double num: list) {
				if (num > max) {
					max = num;
				}
			}
			return max;
		}
		return 0.0;
	}
	
	
	public double minValue() {
		if (!list.isEmpty()){
			double min = Double.MAX_VALUE;
			for (double num: list) {
				if (num < min) {
					min = num;
				}
			}
			return min;
		}
		return 0.0;
	}

	public double average() {
		if (!list.isEmpty()) {
			double temp = 0;
			for (double num: list) {
				temp += num;
			}
			return temp / list.size();
		}
		return 0.0;
	}

	public double greatestFluctuation() {
		if (list.isEmpty() || list.size() < 1) {
			return 0.0;
		}
		
		double temp = 0.0;
		double temp2;
		for (int i = 0; i < list.size() - 1; i++) {
			temp2 = Math.abs(list.get(i + 1) - list.get(i));
			if (temp < temp2) {
				temp = temp2;
			}
		}
		return temp;
	}
	
	public double variance() {
		if (list.isEmpty() || list.size() < 1) {
			return 0.0;
		}
		double temp = 0;
		for (int i = 0; i < list.size(); i++) {
			temp += Math.pow(list.get(i) - average(), 2);
		}
		return temp / (list.size()-1);
		
	}
	
}


















