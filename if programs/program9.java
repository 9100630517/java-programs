import java.util.*;
class program9{
	 getprint(int a,int b){
		if(a==b){
			System.out.println("given number equal ");
		}
		if(a!=b){
			System.out.println("given number not equal");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		program9 p9=new program9();
		p9.getprint(a,b);
	}
}