
class person  {
	String name ; 
	int age ;
	person (String name , int age) { 
		this.name = name ;
		this.age = age ; 
	}
}
	class Employee extends person { 
		int Eid ; 
		int salary ; 
		Employee(String name , int age  , int Eid , int salary ){
			super(name,age) ;
			this.Eid = Eid ;
			this.salary = salary ; 
		}
		public void EmpDisplay() {
			System.out.println("The name of the person is:" + name);
			System.out.println("The age  of the person is:" + age );
			System.out.println("The Eid is:" + Eid);
			System.out.println("The salary of the person is :" + salary);
		}
	}
	
public class Program_5 {

	public static void main(String[]args){
		        Employee e1 = new Employee("John Doe", 30, 123456, 50000);
        Employee e2 = new Employee("Jane Doe", 29, 214365, 33000);

        e1.empDisplay();
        e2.empDisplay();

	}

}
