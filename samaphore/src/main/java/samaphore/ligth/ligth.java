package samaphore.ligth;

public interface ligth {
	enum OnOff{ON, OFF};
	
	void turnOn();
	void turnOff();
	
	boolean isOff();
	boolean isOn();
	
}
