import java.util.*;
class switchmonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month");
		String s = sc.next();
		 String s1 = s.toLowerCase();
		 
		 
		switch(s1) {
			case "jan":
	
			case "mar":
			
			case "jul":
			
			case "aug":
			
			case "oct":
			
			case "dec":
			System.out.println("31 days");
			 break;
			 case "feb":
			 System.out.println("28 days");
			 break;
			 case "apr":
	
			case "june":
			
			case "sep":
			
			case "nov":
			System.out.println("30 days");
			
			
		}
	}
}