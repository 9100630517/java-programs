import java.util.*;
class switchgrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sub1 marks");
		int sub1 =sc.nextInt();
		System.out.println("enter sub2 marks");
		int sub2 =sc.nextInt();
		System.out.println("enter sub3 marks");
		int sub3 =sc.nextInt();
		System.out.println("enter sub4 marks");
	    int sub4 =sc.nextInt();
	    System.out.println("enter sub5 marks");
	    int sub5 =sc.nextInt();
	  
	   int n = (((sub1+sub2+sub3+sub4+sub5)*100)/500) ;
        int m =(n/10);
         switch(m){
          case 9:
          case 8: System.out.println("A grade");
          break;
          case 7:
          case 6:
          case 5:System.out.println("B grade");
          break;
          case 4:
          case 3:System.out.println("c grade");
          break;
          case 2:
          case 1:System.out.println("D grade");
         }
          
         



	}
}