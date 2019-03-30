import java.util.*;
class replacestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.next();
		String s2 = sc.next();
		
		String s3 = s.replace(s1,s2);
		System.out.println(s3);
	}
}