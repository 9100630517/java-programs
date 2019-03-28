import java.util.*;
class program20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.modulus division");
		System.out.println("5.division");
		System.out.println("enter the number");
		 int m = sc.nextInt();
	 //    System.out.println("enter a value");
		// int a = sc.nextInt();
		// System.out.println("enter b value");
  //       int b = sc.nextInt();
  //       System.out.println("result");
  //       program20 p20 = new program20() ;
        // System.out.println(p20.getprint(a,b,m));

	// }
	// public int getprint(int a,int b,int m) {
   //       Scanner sc = new Scanner(System.in);
   //       System.out.println("enter m value");
   //       int m = sc.nextInt();
   //       System.out.println("enter a value");
		 // int a = sc.nextInt();
		 // System.out.println("enter b value");
   //       int b = sc.nextInt();
		if(m==1) {
			addition();
		}
		
	 if(m==2) {
		     substraction();
		 }
		 if(m==3) {
			multiplication();
		 }
		if(m==4) {
		 	modulus ();
		 }
		 if(m==5) {
		 	division();
		 }
	      if(m>5){
		 	System.out.println("invalid input");
		 }
		 
		}
		 public static void addition() {
			Scanner kp = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = kp.nextInt();
			System.out.println("Enter b value");
			int b = kp.nextInt();

			if(a>0 && b>0) {
				System.out.println("sum:"+a+"+"+ b + "="+(a+b));
			}
			else if(a>0 && b<0) {
				System.out.println("sum:"+a+"+" +"(" +b+ ")" + "=" +(a+b));
			}
			else if(a<0 && b>0) {
				System.out.println("sum:"+"(" +a+ ")" + "+" +b+ "=" +(a+b));
			}
			else if(a<0 && b<0) {
				System.out.println("sum:"+ "(" +a+")" + "+" + "("+b+")" + "=" +(a+b));
			}
			

		}

		public static void substraction() {
			Scanner kp = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = kp.nextInt();
			System.out.println("Enter b value");
			int b = kp.nextInt();

			if(a>0 && b>0) {
				System.out.println("sum:"+a+"-"+ b + "="+(a-b));
			}
			else if(a>0 && b<0) {
				System.out.println("sum:"+a+"-" +"(" +b+ ")" + "=" +(a-b));
			}
			else if(a<0 && b>0) {
				System.out.println("sum:"+"(" +a+ ")" + "-" +b+ "=" +(a-b));
			}
			else if(a<0 && b<0) {
				System.out.println("sum:"+ "(" +a+")" + "-" + "("+b+")" + "=" +(a-b));
			}
}
			public static void multiplication() {
			Scanner kp = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = kp.nextInt();
			System.out.println("Enter b value");
			int b = kp.nextInt();

			if(a>0 && b>0) {
				System.out.println("sum:"+a+"*"+ b + "="+(a*b));
			}
			else if(a>0 && b<0) {
				System.out.println("sum:"+a+"*" +"(" +b+ ")" + "=" +(a*b));
			}
			else if(a<0 && b>0) {
				System.out.println("sum:"+"(" +a+ ")" + "*" +b+ "=" +(a*b));
			}
			else if(a<0 && b<0) {
				System.out.println("sum:"+ "(" +a+")" + "*" + "("+b+")" + "=" +(a*b));
			}
}
            public static void modulus() {
			Scanner kp = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = kp.nextInt();
			System.out.println("Enter b value");
			int b = kp.nextInt();

			if(a>0 && b>0) {
				System.out.println("sum:"+a+"%"+ b + "="+(a%b));
			}
			else if(a>0 && b<0) {
				System.out.println("sum:"+a+"%" +"(" +b+ ")" + "=" +(a%b));
			}
			else if(a<0 && b>0) {
				System.out.println("sum:"+"(" +a+ ")" + "%" +b+ "=" +(a%b));
			}
			else if(a<0 && b<0) {
				System.out.println("sum:"+ "(" +a+")" + "%" + "("+b+")" + "=" +(a%b));
			}
}
			public static void division() {
			Scanner kp = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = kp.nextInt();
			System.out.println("Enter b value");
			int b = kp.nextInt();

			if(a>0 && b>0) {
				System.out.println("sum:"+a+"/"+ b + "="+(a/b));
			}
			else if(a>0 && b<0) {
				System.out.println("sum:"+a+"/" +"(" +b+ ")" + "=" +(a/b));
			}
			else if(a<0 && b>0) {
				System.out.println("sum:"+"(" +a+ ")" + "/" +b+ "=" +(a/b));
			}
			else if(a<0 && b<0) {
				System.out.println("sum:"+ "(" +a+")" + "/" + "("+b+")" + "=" +(a/b));
			}		
}
}