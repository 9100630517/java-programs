//rotated right 2


import java.util.*;
class stringmethod8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String s = sc.next();
   stringmethod8 sm8 = new stringmethod8();
   System.out.println(sm8.getprint(s));
}
public String getprint(String s){
	String s1 = s.substring(s.length()-2,s.length())+s.substring(0,s.length()-2);
    return s1;
		
	}

}