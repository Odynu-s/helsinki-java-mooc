package calculator;

import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
	private JFrame frame;
	private JTextField outputField;
	private JTextField inputField;
	private JButton plus;
	private JButton minus;
	private JButton z;
	private JPanel panel;

	@Override
	public void run() {
		frame = new JFrame("Calculator");
		
		frame.setPreferredSize(new Dimension(400, 400));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		GridLayout layout = new GridLayout(3, 1);
		container.setLayout(layout);
		foo();
		createPanel();
		panel.add(plus);
		panel.add(minus);
		panel.add(z);
		
		container.add(outputField);
		container.add(inputField);
		container.add(panel);	
	}
	
	public void foo() {
		outputField = new JTextField("0");
		outputField.setEnabled(false);
		inputField = new JTextField();
		plus = new JButton("+");
		minus = new JButton("-");
		z = new JButton("z");
		CalculatorLogic calc = new CalculatorLogic();
		CalculatorListener listener = new CalculatorListener(calc, outputField, inputField, plus, minus, z);
		plus.addActionListener(listener);
		minus.addActionListener(listener);
		z.addActionListener(listener);
	}
	
	public JPanel createPanel() {
		panel = new JPanel(new GridLayout(1, 3));
		return panel;
	}

}
