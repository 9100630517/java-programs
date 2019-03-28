//return the string without those'x' chars
import java.util.*;
class stringmethod9 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    String s = sc.next();
        stringmethod9 sm9 = new stringmethod9();
        System.out.println(sm9.chars(s));
}
    public String chars(String s) {

           if(s.length()==0 || s.length()==1){
            	return "";
            }

    	   else if(s.charAt(0)=='x'&&s.charAt(s.length()-1)=='x') {
               return(s.substring(1,s.length()-1));
            }

		   else if(s.charAt(s.length()-1)=='x'){
                return(s.substring(0,s.length()-1));
		    }

           else if(s.charAt(0)=='x') {
            	return(s.substring(1,s.length()));
            }

           else if(s.charAt(0)=='x'&&s.charAt(s.length()-1)=='x') {
            	return(s.substring(1,s.length()-1));
            }
            
           return s;
}
}
