package Concepts;

class Employee{
	 int empNo;
	 String empName;
	 int salary;
	 static String ceoName = "Cheran";
	 static String branch;
	 
	 static {                    // when you load a class
//		 ceoName= "Hitachi";
		 System.out.println("Static block executed");
	 }
	 
	 public Employee() { // when you create an object
		 empNo= 272;
		 empName= "Hariharan";
		 salary= 20000;
		 System.out.println("Constructor block executed");
	}
	 
	 static {                    // when you load a class
		 branch= "Japan";
		 System.out.println("Static 2 block executed");
	 }
	 
	 void show() {
		 System.out.println(empNo + " : " + empName + " : " + salary + " : " + ceoName + ":" + branch);
	 }
}

public class StaticDemo {
	int i;
    public static void main(String[] args) {
	   Employee emp1 = new Employee();
//	   i = 9;   // we can't use not static variable static method.
//	   emp1.empNo= 272;
//	   emp1.empName= "Hariharan";
//	   emp1.salary= 20000;
//	   Employee.ceoName= "Cheran"; // we don't need object to access for static variable
	   
	   Employee emp2 = new Employee();
//	   emp2.empNo= 275;
//	   emp2.empName= "Indrajith";
//	   emp2.salary= 50000;
//	   Employee.ceoName= "Cheran"; // we don't need object to access for static variable
	   
	   Employee.ceoName= "Nata";
//	   Employee.branch= "Chennai";  // we don't need object to access for static variable
	   
	   emp1.show();
	   emp2.show();
	   
    	
	}
}
