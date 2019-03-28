import java.util.Scanner;
class programs7 {
	String getprint(String S,String S1){
	if(S.equals(S1)){
		return "true";
		
	}
	return "false";
}
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	String s = sc.next();
	String s1 = sc.next();
	programs7 ps7=new programs7();
	System.out.println(ps7.getprint(s,s1));
System.out.println("given String are  equal");
}
}