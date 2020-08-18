package gameoflife;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawingBoard extends JPanel implements ActionListener {

    private GameOfLifeBoard gameBoard;
    Timer tm = new Timer(15, this);

    public DrawingBoard(GameOfLifeBoard gameBoard) {
        super.setBackground(Color.BLACK);
        this.gameBoard = gameBoard;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.gameBoard.drawCirles(graphics);
        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        this.gameBoard.applyManageCellMethod();
        repaint();
    }
}