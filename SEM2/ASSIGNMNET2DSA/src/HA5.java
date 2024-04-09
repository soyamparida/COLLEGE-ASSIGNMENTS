class pointtype {
	int x  ; 
	int  y ; 
	pointtype(int x , int y){
		this.x = x ; 
		this.y = y ;
	}
	public void setCoordinates(int x , int y  ) {		 
		this.x= x;
		this.y = y ;
	}
	public int getX(){
		return x ;
	}
	public int getY() {
		return y ;
	}
	public void printCcordinates () {
		System.out.println("(" + x + "," + y + "0");
	}
}
	class circle extends pointtype {
                  int radius ;
		circle(int x, int y ,  int radius) {
			super(x, y);
			this.radius = radius ;
			// TODO Auto-generated constructor stub
		}
		public void printradius () { 
			System.out.println("Radius" + radius );
		}
		public void  printarea () {
			double area = Math.PI * radius * radius ;
		}
		public void circumference () { 
			double circumference = 2 * Math.PI * radius ;
			System.out.println("Circumference:"+circumference);
		}
	}
public class HA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pointtype point = new pointtype (3,4) ;
System.out.println("Coordinates of the point: ");
point.printCcordinates();

// creating circlce with the point as the center and radius 5

circle c = new circle (3,4,5) ; 
c.printradius(); 
c.printarea();
c.printcircumference ();

	}

}
