import java.util.Scanner;

 class findSolution {
	static Scanner scan = new Scanner(System.in);
	//String username = scan.next();
	//String password = scan.next();



	public static void main(String[] args) {
	 // Scanner scan = new Scanner(System.in);
    // String str = scan.next();

		System.out.println("Enter username");
		String username = scan.next();

		System.out.println("Enter password");
		 String password = scan.next();

		if (checkUserName(username)){
			if (checkUserPassword(password)){
				System.out.println("Login successfull");
			}
			else{
				System.out.println("Check password");
			}
		}
		else{
			System.out.println("Check username");
		}
		
		scan.close();
	}
		


	private static boolean checkUserName(String str) {

		if (str.equals("UserData.userName")) {
			return true;
		}
		return false;
	}

	private static boolean checkUserPassword(String str) {

		if (str.equals("UserData.password")) {
			return true;
		}
		return false;
	}

}
