import java.util.*;
class reversestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 // String s = "reverse program";
		String s = sc.next();
	    String s1 = "";
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
	   }
		System.out.println(s1);
	}
}