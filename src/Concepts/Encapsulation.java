package Concepts;

 /**
  * Encapsulation Binding data with methods
  * private variable
  * getter and setter methods
  * 
  * @author Hariharan
  *
  */
class StudentDetails {
	
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		// User setting the values we add log thorught method
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {
	
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		s1.setRollno(20);
		s1.setName("Hari");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}
	
}
