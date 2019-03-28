//first two chars in the string also appear at the end of the string

import java.util.*;
class stringmethod7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		stringmethod7 sm7 = new stringmethod7();
		System.out.println(sm7.rotatedright(s));
	}
	public String rotatedright(String s) {
        if(s.substring(s.length()-2,s.length()).equals(s.substring(0,2))){
		return "true";
	}
	else{
	return"false";
}
}
}