package ass7;

public class GasCar extends Vehicle {		
	
	GasCar(String name,double fuel,double power, int numberOfTires, int pressure, double maxFuelLevel){
		super(name,fuel,power,numberOfTires,pressure);
		this.typeEngine= new combustEngine(fuel,power, maxFuelLevel);
	}


}
