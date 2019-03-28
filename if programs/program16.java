import java.util.*;
class program16 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean d = sc.nextBoolean();
		program16 p16 = new program16();
		System.out.println(p16.getoutput(a,b,c,d));
	}
	public  boolean  getoutput(int a,int b,int c,boolean d){
 return(((b>a)&&(c>b))&&(d==false)) ?  true :  ((c>b)&&(d==true)) ?  true : false ;		
 
}
    
}