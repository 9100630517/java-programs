import java.util.*;
class nestedif5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		if(abequal(a,b)){
			System.out.println("a is equal to b");
		if(agreterb(a,b)){
			System.out.println("a is greter than b");
		}
		else{
			System.out.println("b is greterthan a");
		}
		

		 }
		 else{
		 	System.out.println("a is not equal to b");
		 }
	}
        public static boolean abequal(int a,int b){
        	if(a==b){
        	return true;
        }
        return false;
}
        public static boolean agreterb(int a,int b){
	     if((a>b)||(b>a)){
	      return true;
         }
          return false;
  }
}