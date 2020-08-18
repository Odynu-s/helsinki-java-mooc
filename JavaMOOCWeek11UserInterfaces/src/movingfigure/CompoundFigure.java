package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure {

	private List<Figure> list;
	
	public CompoundFigure() {
		super(0, 0);
		this.list = new ArrayList<Figure>();
	}
	
	public void add(Figure f) {
		list.add(f);
	}
	
	public void draw(Graphics graphics) {
		for (Figure figure: list) {
			figure.draw(graphics);
		}
	}
	
	@Override
	public void move(int dx, int dy) {
		for (Figure figure: list) {
			figure.move(dx, dy);
		}
	}
}
