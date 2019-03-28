import java.util.*;
class nestedif {
	public static void main(String[] args){
		// nestedif n =new nestedif();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name");
		String s = sc.next();
		if(checkusername(s)) {
			System.out.println("enter your password");
			String s1 = sc.next();
		if(checkpassword(s1)){
			System.out.println("login succfully");
		}
			else {
				System.out.println("check password");
			}
		} 
		else {
			System.out.println("check username");
		}
		 		// System.out.println(n.checkusername(s));
		// System.out.println(n.checkpassword(s1));
}
   public static boolean checkusername(String s ){
	if(s.equals("admin")){
		return true;
	}
	return false;
}
   public static boolean checkpassword(String s1 ){
      
	if(s1.equals("admin123")){
		return true;
	}
	return false;
   }			

 }


 //    if(s.equals("admin")){
	// System.out.println("enter your password");
	// 	    String s1 = sc.next();
	// 	     if(s1.equals("admin123")){
 //      		    System.out.println("login succfully"); // with out methods
 //      		}
	// 	    else{
	// 	    	System.out.println("check password");
	// 	    }
	// 	}

 //    else{
	// System.out.println("check username");
 //        }

//	} 
//}
