package ass7;

public class tire {
private double pressure;
	
	tire(double pressure){
		this.pressure=pressure;
	}
	String getPressure() {
		return "the pressure of the tire is "+this.pressure + "bar";
	}
}
