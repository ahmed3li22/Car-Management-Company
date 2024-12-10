package ass7;
public class EEngine extends Engine {

	private double maxEnergy;
	EEngine(double fuel, double power, double maxEnergy){
		super(fuel,power);
		this.maxEnergy=maxEnergy;
	}
	public double getMax() {
		return this.maxEnergy;
	}

}

