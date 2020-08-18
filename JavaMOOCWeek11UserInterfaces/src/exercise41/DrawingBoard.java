package exercise41;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
	
	public DrawingBoard() {
		super.setBackground(Color.WHITE);
	}
	
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		
		graphics.fillRect(200, 200, 100, 100);
		graphics.fillRect(500, 200, 100, 100);
		graphics.fillRect(100, 400, 100, 100);
		graphics.fillRect(600, 400, 100, 100);
		graphics.fillRect(200, 500, 400, 100);
	}

}
