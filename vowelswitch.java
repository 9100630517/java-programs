import java.util.*;
class vowelswitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the letter");
	
		String s = sc.next();
		String lowerCaseString=s.toLowerCase();
		char c=lowerCaseString.charAt(0);
		//System.out.println("enter the letter");
	
	switch(c){
		case 'a': 
		
		case'e':
		
		case'i':
	    
		case'o':
	    
		case'u':
	    System.out.println("vowel");
	    	    break;

	    default:
	    System.out.println("consonant");
	}
}
}