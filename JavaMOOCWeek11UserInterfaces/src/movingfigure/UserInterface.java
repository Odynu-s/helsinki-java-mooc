package movingfigure;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	private JFrame frame;
	private Figure figure;
	
	public UserInterface(Figure figure) {
		this.figure = figure;
	}
	
	public void run() {
		frame = new JFrame("Drawing Board");
		frame.setPreferredSize(new Dimension(500, 500));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		container.add(new DrawingBoard(figure));
		addListeners();
		
	}
	
	private void addListeners() {
		frame.addKeyListener(new KeyboardListener(frame, figure));
	}

}