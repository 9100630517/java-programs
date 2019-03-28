import java.util.*;
class comobostring1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 String s = sc.next();
	 String s1 = sc.next();
	 System.out.println(comobo(s,s1));
}
public static String comobo(String s,String s1) {
	if(s.length()<s1.length()){
		return(s+""+s1+""+s);
	}
	
	return(s1+""+s+""+s1);

}
}