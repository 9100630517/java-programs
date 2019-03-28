import java.util.*;
class program14 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		program14 p14 = new program14();
		System.out.println(p14.getouput(n));
	}
	public boolean getouput(int n ){
		return ((n%3==0)||(n%5==0)) ? true : false ;		
		}
}