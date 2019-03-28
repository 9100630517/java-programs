import java.util.Scanner;
class programs9 {
	String getprint(String S){
	if(S.equals("abc")){
		return "true";
		
	}
	return "false";
}
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	String s = sc.next();
	
	programs9 ps9=new programs9();
	System.out.println(ps9.getprint(s));

}
}