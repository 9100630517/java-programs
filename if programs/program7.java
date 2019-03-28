import java.util.*;
class program7{
	void getprint(int x){
	if(x==20){
	System.out.println("equal number");
	}
}
void getprint1(String y){
	if(y=="abc"){
		System.out.println("equal number");
	}
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	String y=sc.next();
	program7 p7=new program7();
	p7.getprint(x);
	p7.getprint1(y);
}
}
