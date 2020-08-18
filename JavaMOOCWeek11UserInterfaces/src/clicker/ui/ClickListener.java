package clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import clicker.applicationlogic.*;

public class ClickListener implements ActionListener {
	private Calculator calc;
	private JLabel text;
	
	public ClickListener(Calculator calc, JLabel text) {
		this.calc = calc;
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calc.increase();
		text.setText(Integer.toString(calc.giveValue()));
	}
}