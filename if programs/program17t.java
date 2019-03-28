import java.util.*;
class program17t {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z=  sc.nextInt();
		program17t p17t = new program17t();
		System.out.println(p17t.getouput(x,y,z));
	}
	public boolean getouput(int x,int y,int z) {
		return (((x>=13)&&(x<=19)) || ((y>=13) &&(y<=19))|| ((z>=13) && (z<=19))) ? true :false ;
		
	}
}