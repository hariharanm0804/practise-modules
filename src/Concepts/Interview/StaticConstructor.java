package Concepts.Interview;

class ParentClass{
    static {
    	System.out.println("Parent Static Method");
    }
    protected ParentClass(){
    	System.out.println("Parent Constrcutor Method");
    }
}

class ChildClass extends ParentClass{
	static {
    	System.out.println("Child Static Method");
    }
	ChildClass(){
    	System.out.println("Child Constrcutor Method");
    }
}
public class StaticConstructor {
   public static void main(String[] args) {
	new ChildClass();
}
}
