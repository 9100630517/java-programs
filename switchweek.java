import java.util.*;
class switchweek {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x =sc.nextInt();
		switch(x){
			case 1:
			System.out.println("monday");
			break;
			case 2:
			System.out.println("tueseday");
			break;
			case 3:
			System.out.println("wednesday");
			break;
			case 4:
			System.out.println("thurseday");
			break;
			case 5:
			System.out.println("friday");
			break;
			case 6:
			System.out.println("saturday");
			break;
			case 7:
			System.out.println("sunday");
            break;
            default:
            System.out.println("invalid");
		}

	}
}