package Concepts.Interview;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EmployeeExtern implements Externalizable{

	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}

class EmployeeSerial implements Serializable{
	int rollNo;
	String name;
	
	EmployeeSerial(int rollno, String eName)
	{
		rollNo = rollno;
		name = eName;
	}
}
public class Serialization {
     public static void main(String[] args) throws Exception {
    	 EmployeeSerial es = new EmployeeSerial(200, "Hari");
    	 FileOutputStream fos = new FileOutputStream("EmployeeOutput.txt");
    	 ObjectOutputStream os = new ObjectOutputStream(fos);
    	 os.writeObject(es);
    	 System.out.println("Serialization Happened Successfully");
    	 os.flush();
    	 os.close();
    	 ObjectInputStream is = new ObjectInputStream(new FileInputStream("EmployeeOutput.txt"));
    	 EmployeeSerial s1 = (EmployeeSerial) is.readObject();
    	 System.out.println("Deseriazation Happened Successfully");
    	 System.out.println(s1.rollNo + "  " + s1.name );
	}
	
	
}
