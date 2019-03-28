import java.util.*;
class outstring {
	String s =  	String s1= "word";
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		 String s1 = sc.next();
	     outstring os = new outstring();
	    // System.out.println(os.s+ " "+os.s2+" "+os.s1);
	     // System.out.println(os.getprint(s,s1));
          // } 
          // public String getprint(String s,String s1) {
		 // using charAt
		 //String output = s.charAt(0)+""+s.charAt(1)+""+s1+""+s.charAt(2)+""+s.charAt(3);
		 //System.out.println(output);
		 // String s3= s.charAt(0)+""+s.charAt(1)+""+s1+""+s.charAt(2)+""+s.charAt(3);
		 // return s3;
		 //using substring
		 String output = s.substring(0,2)+""+s1+s.substring(2);
		 System.out.println(output);
	}
}