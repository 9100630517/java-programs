import java.util.*;
class positionnestedif {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the experince");
		//positionnestedif p = new positionnestedif();
		//p.getprint();
		int  x = sc.nextInt();
	//}
	//private void getprint(){
		
		if(x>10){
			System.out.println("enter the traning peroid");
			int y = sc.nextInt();
			if(y>5){
				System.out.println("enter your cuurent post");
				String s = sc.next();
			if(s.equals("a")){
				System.out.println("qualified to be promoted to manager");
			}
			else{
				System.out.println("become assitant manager first");
			}	
			}
			else{
				System.out.println("need more experince");
			}
		}
		else{
			System.out.println("need more training");
		}
	}
}