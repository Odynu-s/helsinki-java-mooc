package application;

public class ConstantSensor implements Sensor {
	
	private int measured;
	
	public ConstantSensor(int measured) {
		this.measured = measured;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public int measure() {
		// TODO Auto-generated method stub
		return this.measured;
	}

}
