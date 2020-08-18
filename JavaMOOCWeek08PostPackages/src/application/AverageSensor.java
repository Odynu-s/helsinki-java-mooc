package application;

import java.util.*;

public class AverageSensor implements Sensor {
	private List<Sensor> sensorlist;
	private boolean on;
	private List<Integer> measurelist = new ArrayList<Integer>();

	@Override
	public boolean isOn() {
		for (Sensor sensor: sensorlist) {
			if (!sensor.isOn()) {
				return false;
			}	
		}
		return true;
	}

	@Override
	public void on() {
		for (Sensor sensor: sensorlist) {
			sensor.on();
		}
	}

	@Override
	public void off() {
		for (Sensor sensor: sensorlist) {
			sensor.off();
		}
	}

	@Override
	public int measure() {
		if (!isOn()) {
			throw new IllegalStateException();
		}
		int temp = 0;
		for (Sensor sensor: sensorlist) {
			temp += sensor.measure();
		}
		temp /= sensorlist.size();
		measurelist.add(temp);
		return temp;
	}
	
	//constructor
	public AverageSensor() {
		this.sensorlist = new ArrayList<Sensor>();
		this.on = false;
	}
	
	public void addSensor(Sensor additional) {
		sensorlist.add(additional);
		
	}
	
	public List<Integer> readings() {
		return measurelist;
	}
}