package Concepts.Java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionAPIDemo {
    public static void main(String[] args) {
		
//    	Collection<Integer> values = new ArrayList<>();
    	List<Integer> values = new ArrayList<>();
    	values.add(2);
    	values.add(8);
    	values.add(9);
    	values.add(3);
    	Collections.sort(values);
    	Collections.reverse(values);
    	
    	List<Integer> cal = values.stream().filter((value) ->  {
    		return value%2 == 0;
    	}).collect(Collectors.toList());
    	
    	List<Integer> valuess = new ArrayList<>();
    	valuess.add(2223);
    	valuess.add(8232);
    	valuess.add(9235);
    	valuess.add(3231);
    	
//    	Comparator<Integer> c = (arg0, arg1)-> (arg0%10 > arg1%10) ? 1: -1;
    	
    	Collections.sort(valuess, (arg0, arg1)-> (arg0%10 > arg1%10) ? 1: -1);
    	    	
    	/**
    	 * Iterator to iterate collection object
    	 */
//    	Iterator<Integer> it = values.iterator();
//    	while(it.hasNext()) {
//    		System.out.print(it.next());    		
//    	}
    	
//    	Set<Integer> valueSet = new HashSet<>();
    	Set<Integer> valueSet = new TreeSet<>();
    	valueSet.add(78);
    	valueSet.add(34);
    	valueSet.add(98);
    	valueSet.add(11);
    	System.out.println(valueSet);
 	}
}
