package mooc.logic;

import mooc.logic.*;
import mooc.ui.*;

public class Main {
	public static void main(String[] args) {
		UserInterface ui = new TextUserInterface();
		new ApplicationLogic(ui).execute(3);
	}
}