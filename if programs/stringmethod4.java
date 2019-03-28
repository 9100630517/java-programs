//return the string made of its first two chars the string "hello" yields"he"
import java.util.*;
class stringmethod4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		stringmethod4 sm4 = new stringmethod4();
		System.out.println(sm4.getoutput(s));
	}
	public String getoutput(String s) {
     String output = s.substring(0,2);
     //System.out.println(output);
	return output ;
	}
}