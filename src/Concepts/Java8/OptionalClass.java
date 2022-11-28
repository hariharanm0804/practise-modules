package Concepts.Java8;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String[] args) {
		String str[] = new String[10];
		str[3] = "Hari";
		str[5] = null;
		str[8] = "Valli";
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> optional = Optional.of(str[5]);
//		System.out.println(optional);
		
		//System.out.println(optional.orElse("Valli is there"));
		
		System.out.println(optional.filter(s -> s.equals("Hari")));
		System.out.println(optional.filter(s -> s.equals("Valli")));
		
		System.out.println(optional.isPresent());
		
		System.out.println(optional.get());
		
		System.out.println(optional.hashCode());
		
		System.out.println(optional.ofNullable(str[8]));
		
		
		
		System.out.println(empty.orElse("Valli is there"));
	}

}
