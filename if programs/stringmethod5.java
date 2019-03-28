import java.util.*;
class stringmethod5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String s  = sc.next();
		String s1  = sc.next();
		stringmethod5 sm5 = new stringmethod5();
		System.out.println(sm5.getoutput(s,s1));
	}
public String getoutput(String s,String s1) {		
		String s2  = s.stratsWith(s1);
		//System.out.println(s2);
		return s2;
		}
	
	
}