package ass7;

public class Engine {
	private double fuelLevel;
	private double powerInHP;
	Engine(double fuel, double power){
		this.fuelLevel=fuel;
		this.powerInHP=power;
	}
	public double getFuelLevel() {
		return this.fuelLevel;
	}
	public double getPowerInHP() {
		return this.powerInHP;
	}
	public double getPowerInKW() {
		double powerInKW=this.powerInHP*0.746;
		return  powerInKW;
	}
	public void stepOnGas(double reduction){
		this.fuelLevel-=this.fuelLevel*reduction/100;
	}
	public double getMax() {
		return 1;
	}
	public void changeFuelLevel(double num) {
		this.fuelLevel=num;
	}
	
}
