import java.util.*;
class eligiblemanagerpositiion {
	public static void main(String[] args){
		Scanner sc = new scanner(System.in);
		System.out.println("enter the experince");
		eligiblemanagerpositiion m = eligiblemanagerpositiion();
		System.out.println(m.getprint(x,y,s));
	}
	private void getprint(){
		int x = sc.nextInt();
		if(x>10){
			System.out.println("enter the traning peroid");
			int y = sc.nextInt();
			if(y>5){
				System.out.println("enter your cuurent post");
				String s = sc.next();
			if(s.equals(a)){
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