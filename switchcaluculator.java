import java.util.*;
class switchcaluculator {
	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int a =sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		System.out.println("enter the operator");

		String s  = sc.next() ;
		System.out.println("result");

		switch(s){
			case "+":
			System.out.println(a+b);
			// System.out.println(a-b);
			break;
			case "-":
			 System.out.println(a-b);
			 break;
			case "*":
			System.out.println(a*b);
			break;
			case "/":
			System.out.println(a/b);
			break;
			}
	}
}