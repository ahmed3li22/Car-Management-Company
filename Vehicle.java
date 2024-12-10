package ass7;

public class Vehicle {
protected String name;
protected int numberOfTires;
protected tire typeTires;
protected Engine typeEngine;
protected boolean driving;
protected boolean drivingFast;
Vehicle(String name,double fuel,double power, int numberOfTires, int pressure){
	this.name=name;
	this.typeTires=new tire(pressure);
	this.typeEngine=new Engine(fuel,power);
	this.driving=false;
	this.drivingFast=false;	
}
public void accelerate(double accelration) {
	if(accelration > 0.5) {
		this.drivingFast=true;
		typeEngine.stepOnGas(30);
	}
	else {
		typeEngine.stepOnGas(5);
	}
	
}
public void drive() {
	this.driving=true;
}
public void stop() {
	this.driving=false;
	this.drivingFast=false;
}
public String boardComputer() {
	return "Vehicle: " + name + "\n"+ "Fuel Level: " + typeEngine.getFuelLevel() + "\n"
			+"Driving: " + (driving ? "Yes" : "No") + "\n" 
			+"Driving Fast: " + (drivingFast ? "Yes" : "No") + "\n";
}
public void refillEngine() {
	 this.typeEngine.changeFuelLevel(100.0);
	 this.stop();
}



	
	
	
	
}