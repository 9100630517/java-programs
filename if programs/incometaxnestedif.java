import java.util.*;
class incometaxnestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("enter your income");
		int income = sc.nextInt();
		if(checkage(age,income)) {
			System.out.println("output = 0%");
	    if(checkvalue(age,income)) {
	    	System.out.println("output = 0%");
	    if(check(age,income)) {
	    	System.out.println("output = 0%");
	    }
	    else{
	    	System.out.println("check the age and income");
	    }	
	    }
	    else{
	         System.out.println("check the age and income");
          }
		}
		else{
	         System.out.println("check the age and income");
          }
	}
	public static boolean checkage(int age,int income){
		if(age<60 && income<250000) {
			return true;
		}
		return false;
	}
	public static  boolean checkvalue(int age,int income){
		if((age>60 && age<80) && (income<300000)) {
			return true;
		}
		return false;
	}
	public static boolean check(int age,int income){
		if(age<60 && income<500000) {
			return true;
		}
		return false;
	}

}