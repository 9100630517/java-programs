import java.util.*;
class nestedif6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
  
        int b = sc.nextInt();
        System.out.println("enter c value");
  
        int c = sc.nextInt();
        System.out.println("enter d value");
  
        int d = sc.nextInt();
        if(equal(a,b,c,d)) {
        	System.out.println("values are equal");
        if(abcequal (a,b,c)) {
        	System.out.println("abc values are equal");
        if(adequal(a,d)){
            System.out.println(" ad values are equal");
        }
        else{
        	System.out.println("ad values are not equal");
        }
        }
        else{
        	System.out.println(" abc values are  not equal");
        }
         }
        else {
        	System.out.println("values are unequal");
        }
	
	}
	public static boolean equal(int a,int b,int c,int d){
      if((a==b)&&(a==c)&&(a==d)&&(b==c)&&(b==d)&&(c==d)) {
      	return true;
	}
	return false;
}
public static boolean abcequal(int a,int b,int c){
	if((a==b)&&(a==c)&&(b==c)) {
		return true;

  }
  return false;
}
public static boolean adequal(int a,int d){
      if((a==d)){
      	return true;
}
 return false;
 }
}