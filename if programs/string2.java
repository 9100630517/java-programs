import java.util.*;
class string2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int length = s1.length();
		System.out.println("length of string:"+ length);
		if((x>=0&&y>0) && y<length){
			System.out.println(s1.substring(x,y));
		}
		else{
			System.out.println("invalid input");
		}
	}

}