 import java.util.*;
 class stringbuffer {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          String s1 =sc.nextLine();
          String s2 = sc.nextLine();
          int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 	StringBuffer sb = new StringBuffer(s);
 	    sb.trimToSize();
          System.out.println(sb.append(s1));

          System.out.println(sb.length());

          System.out.println(sb.insert(a,s2));
         
          System.out.println(sb.capacity());
          System.out.println(sb.delete(b,c));
         
 	}
  }

  class stringbuffer {
 	//String s = "java";
  	public static void main(String[] args) {
  	StringBuffer sb = new StringBuffer("java");
  	    sb.trimToSize();
           System.out.println(sb.append(" oriented"));

           System.out.println(sb.length());

         System.out.println(sb.insert(4," object"));
         
        System.out.println(sb.capacity());
         System.out.println(sb.delete(2,4));
         
	 }
  }
 class stringbulider {
 	public static void main(String[] args) {
 		StringBuilder sb = new StringBuilder("program");
 		sb.trimToSize();
 		System.out.println(sb.append(" language"));
 		System.out.println(sb.insert(7," oriented"));
 		System.out.println(sb.capacity());
 	} 
}