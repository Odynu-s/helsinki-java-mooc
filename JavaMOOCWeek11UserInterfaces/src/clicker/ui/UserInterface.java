package clicker.ui;

import javax.swing.*;
import java.awt.*;
import clicker.applicationlogic.*;

public class UserInterface implements Runnable {

	private JFrame frame;
	private JLabel text;
	private JButton button;
	private Calculator calculator;
	
	public UserInterface(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void run() {
		frame = new JFrame("Click Effect");
		frame.setPreferredSize(new Dimension(400, 200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		
		text = new JLabel("0");
		button = new JButton("Click!");
		button.addActionListener(new ClickListener(calculator, text));
		
		container.add(text);
		container.add(button);
	}
}