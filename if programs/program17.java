import java.util.*;
class program17 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z=  sc.nextInt();
		program17 p17 = new program17();
		System.out.println(p17.getouput(x,y,z));
	}
	public boolean getouput(int x,int y,int z){
		if(((x>=13)&&(x<=19)) || ((y>=13) &&(y<=19))|| ((z>=13) && (z<=19))){
			return true ;

		}
		return false;
	}
}