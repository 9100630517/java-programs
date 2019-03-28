//given two strings append them
import java.util.*;
class stringmethod6 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		String s1= sc.next();
		stringmethod6 sm6 = new stringmethod6();
		System.out.println(sm6.concat(s,s1));
	}
		  public String concat(String s,String s1){
       
          	if(s.substring(s.length()-1,s.length()).equals(s1.substring(0,1))){
          		return s+s1.substring(1,s1.length());
          	}
             else{
             	return s+s1;
             }
             	
	}
}



// if(s.length()>0 && s1.length()>0 && s1.charAt(0)==s.charAt(s.length()-1)){
		  	// 	s1 = s1.substring(1);
		  	// 	return s+s1;
		  	// }
		  	// return s+s1;