package problem;


public class Problem {
	
	boolean validate(String s) {
		char[] c = s.toCharArray();
		int c1 = 0,c2=0;
		int p1 = 0,p2=0;
		int s1  = 0,s2;
		for(char ch: c) {
			if(ch == '{' || ch == '}') {
				c1++;
			}else if(ch == '(' || ch == ')') {
				p1++;
			}
			else if(ch == '[' || ch == ']') {
				s1++;
			}
		}
		if(c1%2 == 0 && p1%2 == 0 && s1%2 == 0) {
			
		}else {
			
		}
		return false;
		
	} 
    public static void main(String[] args) {
    	
    	String str = "{(){([])}}";
    	new Problem().validate(str);
	}
}
