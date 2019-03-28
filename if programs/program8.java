import java.util.*;
class program8{
	void getprint(int x){
		if(x>15 && x<=20){
			System.out.println("whether is cooled");
}
	if(x>20 && x<=25){
		System.out.println("room temperature");
	}
	if(x>25 && x<=40){
		System.out.println("its hot outside apply sunscreen laotion");
	}
	if(x>40 && x<=45){
		System.out.println("its hot outside take umbrella with you");
	}
	if(x<=15){
		System.out.println("its too cold outside wear weather jacket");
	}
	
	
}
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	int x=sc.nextInt();
	program8 p8=new program8();
	p8.getprint(x);
}
}