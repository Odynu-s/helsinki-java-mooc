package application;

import java.util.*;

public class Thermometer implements Sensor {
	
	private boolean on;

	@Override
	public boolean isOn() {
		return this.on;
	}

	@Override
	public void on() {
		this.on = true;

	}

	@Override
	public void off() {
		this.on = false;

	}

	@Override
	public int measure() {
		if (!this.on) {
			throw new IllegalStateException();
		}
		Random random = new Random();
		return random.nextInt(60) - 30;
	}
	
	public Thermometer() {
		this.on = false;
	}

}
