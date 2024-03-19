
	
	class road { 
		int meters ;
		int centimeters ;
		
	road (int meters , int centimeters ){ 
		this.meters = meters ;
		this.centimeters = centimeters ; 
		}
	public void display () { 
		System.out.println("The distance in meters is " + meters);
		System.out.println("The distance in centimeters is " + centimeters);
	}
	
public int sum() {
	return this.meters + this.centimeters ;
}
}

public class HA4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
road distance1 = new road (100000,10000000);
System.out.println(distance1.sum());
distance1.display();
road distance2 = new road (67000,6700000);
System.out.println(distance2.sum());
distance2.display();
road distance3 = new road (88000,8800000);
System.out.println(distance3.sum());
distance3.display();
	}

}
