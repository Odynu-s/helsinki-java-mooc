package survey;

import java.awt.*;
import javax.swing.*;

public class Survey implements Runnable {
	private JFrame frame;
	private JCheckBox yesButton;
	private JCheckBox noButton;
	
	private JRadioButton noreason;
	private JRadioButton other;
	private ButtonGroup buttonGroup;
	private JButton click;
	

	@Override
	public void run() {
		frame = new JFrame("Survey");
		frame.setPreferredSize(new Dimension(400, 400));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		
		yesButton = new JCheckBox("Yes");
		noButton = new JCheckBox("No");
		noreason = new JRadioButton("No reason!");
		other = new JRadioButton("Because it is fun");
		click = new JButton("Click");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(noreason);
		buttonGroup.add(other);
		
		container.add(new JLabel("Are you?"));
		container.add(yesButton);
		container.add(noButton);
		container.add(new JLabel("Why?"));
		container.add(noreason);
		container.add(other);
		container.add(click);
		
	}

}
