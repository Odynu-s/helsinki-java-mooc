package exercise41;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	private JFrame frame;

	@Override
	public void run() {
		frame = new JFrame("Drawing Board");
		frame.setPreferredSize(new Dimension(900, 900));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		container.add(new DrawingBoard());
	}

}
