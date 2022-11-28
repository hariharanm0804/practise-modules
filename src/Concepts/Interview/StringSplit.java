package Concepts.Interview;


class SplitClass{
	 String str3;
	 String splittingMethod(String str, String[] ab) {
		   String str2 = null;
		   for(String s: ab){
				  if(s.contains(",")){
					  String[] b = s.split(",");
					  str2 = str3.concat(splittingMethod(str2,b));
				  }else if(s.contains("/")) {
					  String[] c = s.split("/");
					  str2 = str3.concat(splittingMethod(str2,c));
				  }else {
					  str3 = str3 != null ? str3.concat(s) : s;
				  }
			}
		   return str2;
	   }
}
public class StringSplit {
  
   public static void main(String[] args) {
	 String str = "1 23,45/6";
	 String[] a = str.split(" ");
	 SplitClass sc = new SplitClass();
	 sc.splittingMethod(str, a);
	 System.out.println(sc.str3);
	
}
}
