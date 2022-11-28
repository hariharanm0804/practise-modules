package Concepts.Interview;

import java.util.GregorianCalendar;

//public class StringFamily {
//   public static void main(String[] args) {
//	  String s = new String("ABC");
//	  System.out.println(s.concat("EDF"));
//	  
//	  StringBuilder s1 = new StringBuilder("ABC");
//	  System.out.println(s1.append("EDF"));
//	  
//	  StringBuffer s2 = new StringBuffer("ABC");
//	  System.out.println(s2.append("EDF"));
//}
//}

public class StringFamily {

	public static void main(String[] args) {
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken:"+(end-start));
		System.out.println("Memory used:"+(startMemory-endMemory));
	}
}
