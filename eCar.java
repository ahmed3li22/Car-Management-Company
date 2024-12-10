package ass7;

public class eCar extends Vehicle {
    eCar(String name, double fuel, double power, int numberOfTires, int pressure, double maxEnergyLevel) {
        super(name, fuel, power, numberOfTires, pressure);
        this.typeEngine = new EEngine(fuel, power, maxEnergyLevel); 
    }

   
    public String boardComputer() { 
        return name + " driving with " + typeEngine.getPowerInHP() + " hp\n" +
               "with charging status at " +
               (this.typeEngine.getFuelLevel() / this.typeEngine.getMax()) * 100 +
               " Percent\n" +
               "Driving: " + (driving ? "Yes" : "No") + "\n" +
               "Driving Fast: " + (drivingFast ? "Yes" : "No") + "\n";
    }
}
