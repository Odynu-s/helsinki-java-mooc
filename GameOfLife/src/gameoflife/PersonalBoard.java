package gameoflife;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    private Scanner reader;
    private Random random;
    private CalculateNumberOfLivingNeighbours cal;
    private boolean[][] tempStorage;

    public PersonalBoard() {
        super();
        this.reader = new Scanner(System.in);
        this.random = new Random();
        this.cal = new CalculateNumberOfLivingNeighbours();
        this.tempStorage = new boolean[super.getWidth()][super.getHeight()];
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (x >= 0 && x < super.getWidth()
                && y >= 0 && y < super.getHeight()) {
            super.getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToWaiting(int x, int y) {
        if (x >= 0 && x < super.getWidth()
                && y >= 0 && y < super.getHeight()) {
            super.getBoard()[x][y] = false;
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (x >= 0 && x < super.getWidth()
                && y >= 0 && y < super.getHeight()) {
            if (super.getBoard()[x][y] = true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for (int i = 0; i < super.getBoard().length; i++) {
            for (int j = 0; j < super.getBoard()[i].length; j++) {
                double individualQuotient = random.nextDouble();
                if (individualQuotient <= probabilityForEachCell && probabilityForEachCell != 0) {
                    super.getBoard()[i][j] = true;
                } else {
                    super.getBoard()[i][j] = false;
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int counter = 0;
        if (x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {

            int middle = cal.MiddleArea(x, y, super.getBoard());
            int borders = cal.BordersWithoutCorners(x, y, super.getBoard());
            int corners = cal.Corners(x, y, super.getBoard());
            counter = corners + borders + middle;
        }
        return counter;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {

        if (super.getBoard()[x][y] == true) {
            if (livingNeighbours < 2) {
                tempStorage[x][y] = false;
            } else if (livingNeighbours == 2 || livingNeighbours == 3) {
                tempStorage[x][y] = true;
            } else if (livingNeighbours > 3) {
                tempStorage[x][y] = false;
            }
        } else if (super.getBoard()[x][y] == false) {
            if (livingNeighbours < 2) {
                tempStorage[x][y] = false;
            } else if (livingNeighbours == 3) {
                tempStorage[x][y] = true;
            } else if (livingNeighbours > 3) {
                tempStorage[x][y] = false;
            }
        }
    }

    @Override
    public void applyManageCellMethod() {

        for (int x = 0; x < super.getBoard().length; x++) {
            for (int y = 0; y < super.getBoard()[x].length; y++) {
                this.manageCell(x, y, this.getNumberOfLivingNeighbours(x, y));
            }
        }

        for (int i = 0; i < tempStorage.length; i++) {
            for (int j = 0; j < tempStorage[i].length; j++) {
                super.getBoard()[i][j] = tempStorage[i][j];
            }
        }
    }

    @Override
    public void drawCirles(Graphics graphics) {

        for (int i = 0; i < super.getBoard().length; i++) {
            for (int j = 0; j < super.getBoard()[i].length; j++) {
                int x = 0;
                int y = 0;
                if (i == 0 & j == 0) {
                    x = i * super.getDiameter();
                    y = j * super.getDiameter();
                } else {
                    x = i * super.getDiameter() + 1;
                    y = j * super.getDiameter() + 1;
                }

                if (super.getBoard()[i][j] == true) {
                    graphics.setColor(Color.MAGENTA);
                    graphics.fillOval(x, y, super.getDiameter(), super.getDiameter());

                } else {
                    graphics.setColor(Color.WHITE);
                    graphics.fillOval(x, y, super.getDiameter(), super.getDiameter());
                }
            }
        }
    }
}