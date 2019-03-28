import java.util.*;
class program15 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		program15 p15 = new program15();
		System.out.println(p15.getouput(n));
	}
	public String getouput(int n ){
		return (n%2==0)? "even" : "odd" ;		
		}
}