import java.util.*;
class program4{
	void max(int x,int y){
	if(x>y){
		System.out.println("max number is "+x);
	}
	if(x<y){
		System.out.println("max number is"+y);
	}
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	program4 p4=new program4();
	p4.max(x,y);

}
}
