import java.util.*;
class program13 {
	public int getouput(int a,int b,int c) {

		return (Math.max(a,b)==Math.max(a,c))? a : Math.max(b,c); 
			
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = sc.nextInt();
		System.out.println("enter b value:");
		int b = sc.nextInt();
		System.out.println("enter c value:");
		int c = sc.nextInt();
		program13 p13 = new program13();
		System.out.println(p13.getouput(a,b,c));
		 
	}
	
	} 
