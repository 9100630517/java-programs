import java.util.*;
class program5{
	void num1(int x){
		if(x>0){
		System.out.println("positive number");			
		}
		if(x<0){
				System.out.println("negative number");
		}
		if(x==0){
			System.out.println("zero number");
		}

	}

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	// int y=sc.nextInt();
	// int z=sc.nextInt();
	program5 p5=new program5();
	p5.num1(x);
	// p5.num2(y);
	// p5.num3(z);
}
}

