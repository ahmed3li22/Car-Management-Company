package ass7;

public class test {
	public static void main(String[] args) {
		/*Vehicle raceCar = new Vehicle("Race Car", 100, 300.0, 4, 34);
        Vehicle motorBike = new Vehicle("Motorbike", 80, 150.0, 2, 30);
        raceCar.drive();
        raceCar.accelerate(0.1);
        motorBike.drive();
        motorBike.accelerate(0.1);
        System.out.println(raceCar.boardComputer());
        System.out.println(motorBike.boardComputer());
        raceCar.accelerate(1.0);
        motorBike.accelerate(1.0);
        System.out.println(raceCar.boardComputer());
        System.out.println(motorBike.boardComputer());
        */
		
		
        GasCar gasCar1 = new GasCar("Toyota Corolla", 50, 100, 4, 30, 60);
        GasCar gasCar2 = new GasCar("Ford Mustang", 70, 300, 4, 32, 80);
        GasCar gasCar3 = new GasCar("Chevrolet Camaro", 60, 275, 4, 35, 75);

        
        eCar eCar1 = new eCar("Tesla Model S", 90, 400, 4, 30, 100);
        eCar eCar2 = new eCar("Nissan Leaf", 40, 110, 4, 28, 50);
        eCar eCar3 = new eCar("BMW i3", 50, 170, 4, 29, 60);

       
        Vehicle[] cars = {gasCar1, gasCar2, gasCar3, eCar1, eCar2, eCar3};

        
        System.out.println("=== Accelerating Cars at 50% ===");
        for (Vehicle car : cars) {
            car.accelerate(0.5);
            System.out.println(car.boardComputer());
        }

        
        System.out.println("\n=== Accelerating Cars at 100% ===");
        for (Vehicle car : cars) {
            car.accelerate(1.0);
            System.out.println(car.boardComputer());
        }
        Vehicle[] vehicles = {gasCar1,gasCar2,gasCar3,eCar1,eCar2,eCar3};
        MangeCars.refillVehicles(vehicles);
        
	}
}
