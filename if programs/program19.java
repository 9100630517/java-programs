import java.util.*;
class program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		program19 p19 = new program19();
		// p19.getouput(a,b,x,y);
		System.out.println(p19.getoutput(a,b)); 
	}
	public  int getoutput( int a,int b) {
		// if(Math.abs(a-10)==Math.abs(b-10)) {       
		// 	return 0;
		// }
		// if(Math.abs(a-10)<Math.abs(b-10)) {
		// 	return a;
		// }
		// else {
		// 	return b;

		// int x = Math.abs(a-10);
		// int y = Math.abs(b-10);
		// return(x==y) ? 0 :(x<y) ? a : b ;
		return (Math.abs(a-10)==Math.abs(b-10)) ? 0 :(Math.abs(a-10)<Math.abs(b-10)) ? a : b ;
		
	} 

}










































































