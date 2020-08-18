package gameoflife;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new PersonalBoard());
        SwingUtilities.invokeLater(ui);
    }
}