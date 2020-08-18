package application;

public interface Sensor {
	
	boolean isOn(); //returns true if the sensor is on
	void on();		//turns the sensor on
	void off();		//turns the sensor off
	int measure();	//returns the sensor reading if it is on, throws IllegalStateException if off

}
