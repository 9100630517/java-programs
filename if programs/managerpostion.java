import java.util.*;
class managerpostion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = "assistant manager";
		//String s1 = "junoir or senior manager";
		System.out.println("enter years of experince");
		int x = sc.nextInt();
		if(experince(x)){
          System.out.println("enter the number of training received");
          int y = sc.nextInt();
          if(training(y)){
          	System.out.println("enter your current post");
            String s = sc.next();
          if(post(s)){
          	System.out.println("qualified to be promoted to manager");
          }
          else {
          	System.out.println("become assistant manager first");
          }         

          }
          else {
          	 System.out.println("need more experince");
          }
      }
      else{
      	System.out.println("need more training");
      }
      
}
	public static boolean experince(int x){
		if(x>10){
			return true;
		}
		return false;
	} 
	public static boolean training(int y){
		if(y>5){
		 return true;
		}
		return false;
	}
	public static boolean post( String s) {
		if(s. equals("a")){
			return true;
		}
		return false;
	}
}