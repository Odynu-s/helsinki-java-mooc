package survey;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		Survey survey = new Survey();
		SwingUtilities.invokeLater(survey);
	}

}
