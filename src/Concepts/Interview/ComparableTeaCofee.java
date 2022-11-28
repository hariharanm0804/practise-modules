package Concepts.Interview;

import java.util.Iterator;
import java.util.TreeSet;

class Drink{
     
	String name;
//	@Override
//	public int compareTo(Object arg0) {
//		return 0;
//	}
	
}
public class ComparableTeaCofee {
   public static void main(String[] args) {
	Drink d1 = new Drink();
	Drink d2 = new Drink();
	d1.name = "Coffee";
	d2.name = "Tea";
	TreeSet<Object> ts = new TreeSet<>();
	ts.add(d1);
	ts.add(d2);
	ts.add("wewqwe");
	for(Object d: ts) {
		System.out.println(d);
	}
//	Iterator<Drink> it = ts.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next().name);
//	}
}
}
