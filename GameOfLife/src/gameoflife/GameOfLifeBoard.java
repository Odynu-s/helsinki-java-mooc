package gameoflife;

import java.awt.Graphics;

public abstract class GameOfLifeBoard {
    private int width;
    private int length;
    private boolean[][] board;
    private int fieldLength;
    private int diameter;
    private int numberOfCircesPerRow;

    public GameOfLifeBoard() {
        this.fieldLength = 800;
        this.diameter = fieldLength / 100;
        this.numberOfCircesPerRow = this.fieldLength / (this.diameter + 2);
        this.width = this.numberOfCircesPerRow;
        this.length = this.numberOfCircesPerRow;
        this.board = new boolean[width][length];
    }

    public boolean[][] getBoard() {
        return board;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.length;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public int getFieldLength() {
        return this.fieldLength;
    }

    public abstract void turnToLiving(int x, int y);
    
    public abstract void turnToWaiting(int x, int y);

    public abstract boolean isAlive(int x, int y);

    public abstract void initiateRandomCells(double probabilityForEachCell);

    public abstract int getNumberOfLivingNeighbours(int x, int y);

    public abstract void manageCell(int x, int y, int livingNeighbours);

    public abstract void applyManageCellMethod();

    public abstract void drawCirles(Graphics graphics);
}