package calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorLogic {
	private int value;
	
	public CalculatorLogic() {
		value = 0;
	}
	
	public void add(int num) {
		value += num;
	}
	
	public void subtract(int num) {
		value -= num;
	}
	
	public void clear() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
}