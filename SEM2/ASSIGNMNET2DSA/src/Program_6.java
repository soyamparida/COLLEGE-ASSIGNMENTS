abstract class Marks  {
// lets say total marks is out 100 !!
	int marksICP ;
	int marksDSA ; 
    int percentage  ; 
    abstract public int getpercentage () ;
    // remember you cannot make object of the abstract class
}
class CSE extends Marks  {
  int algoDesign ;
CSE(int marksIcp , int marksDSA , int algoDesign){ 
	this.marksICP=marksIcp ;
	this.marksDSA = marksDSA ; 
	this.algoDesign = algoDesign ; 
}
	@Override
	public int getpercentage() {
		// TODO Auto-generated method stub
		return this.percentage=(this.marksICP+this.marksDSA+this.algoDesign / 100) * 100;
	}
}
class NonCSE extends Marks { 
	int enggMechanics ;
NonCSE (int marksIcp , int marksDSA ,int enggMechanics ) { 
	 // super(marksIcp , marksDSA) ; we cannot use this method cause (should have data types of parameter and the no of parameters you take)
	this.marksICP = marksIcp ; 
	this.marksDSA = marksDSA ;
	this.enggMechanics = enggMechanics ;
}
	@Override
	public int getpercentage() {
		// TODO Auto-generated method stub
		return  this.percentage=(this.marksICP+this.marksDSA+this.enggMechanics / 300) * 100;
	}
	
}
public class Program_6 {
	public static void main(String[] args) {
		CSE c1  = new CSE (34, 67 , 88);
		System.out.println("The percentage of the cse student is : " + c1.percentage );
		NonCSE c2 = new NonCSE (88 , 67 , 34) ; 
		System.out.println("The percentage of the cse student is : " + c2.percentage );

	}
}
