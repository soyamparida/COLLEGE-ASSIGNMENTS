package assignmentpractice1;
import java.util.Scanner; 

public class q1 {

	public static void main(String[] args) {

/*
		  // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance between two cities in kilometers: ");
        double distanceInKilometers = scanner.nextDouble();

        // Convert the distance to meters, feet, inches, and centimeters
        double distanceInMeters = distanceInKilometers * 1000;
        double distanceInFeet = distanceInKilometers * 3280.8399;
        double distanceInInches = distanceInKilometers * 39370.0787;
        double distanceInCentimeters = distanceInKilometers * 100000;

        // Print the converted distances
        System.out.println("Distance in Meters: " + distanceInMeters + " meters");
        System.out.println("Distance in Feet: " + distanceInFeet + " feet");
        System.out.println("Distance in Inches: " + distanceInInches + " inches");
        System.out.println("Distance in Centimeters: " + distanceInCentimeters + " centimeters");

        // Close the Scanner to avoid resource leak
        scanner.close();
        */
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the radius of the ");
		int r = sc.nextInt ();
		double SAH = 3 * 3.14* r *r;
		System.out.println("Enter the radius of hemispher" + SAH);
		double  VH = (2/3) * 3.14 * r*r*r;
		System.out.println("Enter the volume of the hemisphre"+ VH);
	}

}
