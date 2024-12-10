package ass7;

public class MangeCars {
 public static void refillVehicles(Vehicle[] arr) {
	 for(int i =0;i<arr.length;i++) {
		 arr[i].refillEngine();
		 System.out.println(arr[i].boardComputer());
	 }
 }
}
