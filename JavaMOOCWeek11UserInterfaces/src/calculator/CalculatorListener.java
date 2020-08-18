package calculator;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorListener implements ActionListener {
	private CalculatorLogic calc;
	private JTextField outputField;
	private JTextField inputField;
	private JButton plus;
	private JButton minus;
	private JButton z;
	
	
	public CalculatorListener(CalculatorLogic calc, JTextField outputField, JTextField inputField, JButton plus, JButton minus, JButton z) {
		this.calc = calc;
		this.outputField = outputField;
		this.inputField = inputField;
		this.plus = plus;
		this.minus = minus;
		this.z = z;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num = 0;
		try {
			num = Integer.parseInt(inputField.getText());
		} catch (Exception ex) {
			System.out.println("Something fucked up");	
		}
		
		if (e.getSource().equals(plus)) {
			calc.add(num);
			inputField.setText("");
			outputField.setText(Integer.toString(calc.getValue()));
		} else if (e.getSource().equals(minus)) {
			calc.subtract(num);
			inputField.setText("");
			outputField.setText(Integer.toString(calc.getValue()));
		} else if (e.getSource().equals(z)) {
			calc.clear();
			inputField.setText("");
			outputField.setText(Integer.toString(calc.getValue()));
		}
	}
	
	public void setZ() {
		if (this.calc.getValue() == 0) {
			this.z.setEnabled(false);
		}else{
			this.z.setEnabled(true);
		}
	}
}