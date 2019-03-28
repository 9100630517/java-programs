//write a program to print output in nested if condition
import java.util.*;
class printnestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b values");

		 int a = sc.nextInt();
		 int b = sc.nextInt();
		//int c = sc.nextInt();
		//int d = sc.nextInt();

	if(checkvalues(a,b)){
		System.out.println("a and b are equal");
		System.out.println("enter c and values");
		int c = sc.nextInt();
		int d = sc.nextInt();
	if(checkvalue(a,b,c,d)) {
		System.out.println(" c and d values are greterthan a and b");
    if(checkthevalue(c,d)){
    	System.out.println("c is the greterthan d");
    }
    else {
    	System.out.println(" c is lessthan d");
    } 

	}
	else {
		System.out.println(" but a and b values are greterthan c and d");
	}

	}
	else {
		System.out.println("a and b are not equal");
	}

}
private static boolean checkvalues(int a,int b){
	if(a==b ){
		return true;
	}
	return false;
}
private static boolean checkvalue(int a,int b,int c,int d){
	if((c>a&&c>b)&&(d>a&&d>b)){
		return true;
	}
	return false;
}
private static boolean checkthevalue(int c,int d){
	if((c>d)){
		return true;
	}
	return false;
}
}