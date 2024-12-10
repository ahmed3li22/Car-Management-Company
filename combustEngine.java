package ass7;

public class combustEngine extends Engine{
	private double maxFuel;
	combustEngine(double fuel, double power, double maxFuel){
		super(fuel,power);
		this.maxFuel=maxFuel;
	}
	public double getMax() {
		return  this.maxFuel;
	}
}
