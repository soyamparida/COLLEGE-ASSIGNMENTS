import java.util.Scanner;
class Commission { 
	 private double  sales  ; 
 public  Commission (double sales ) { 
	 this.sales = sales ;
 }
 public double  getCommission () { 
	 if (sales <0) { 
		 System.out.println("Invalid Input");
		 return 0.0 ;
	 } else if (sales<=100){ 
		 return sales * 0.02;
	 }else if ( sales >= 500 &&sales<=5000) {
		 return sales*0.05 ;
	 }else {
		 return sales * 0.08 ;
	 }
 }
public class HA1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in) ;
System.out.println("Enter the sales amount:");
double sales = sc.nextDouble();
Commission commission = new Commission (sales);
System.out.println(commission.getCommission()) ;
	}

}
