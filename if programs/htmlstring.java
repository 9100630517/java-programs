//html string
import java.util.*;
class htmlstring {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
             String s = sc.next();
             String s1 = sc.next();
             // String s2 = sc.next();
             htmlstring hm = new htmlstring();
             System.out.println(hm.getprint(s,s1));
         }
             public String getprint(String s,String s1) {
         //using charAt
          // String s3 =  s.charAt(0)+""+s2+s.charAt(1)+""+s1+s.charAt(2)+s.charAt(3)+""+s2+s.charAt(4);
             //System.out.println(s3);
             //String s3 = s.substring(0,3)+""+s1+s.substring(3);
                String s3 =  "<" +s+ ">" +s1+ "</" +s+">";
             return s3;     

	}
}