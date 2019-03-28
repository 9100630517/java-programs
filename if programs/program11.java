import java.util.*;
class program11{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	boolean c=sc.nextBoolean();
	program11 p11=new program11();
	boolean result= p11.getouput(a,b,c);
	System.out.println(result);
}
public boolean getouput(int a, int b, boolean c){
if((a<0&&b<0)&&(c==false)){
	
		return false;
	}
		if((a>0&&b>0)&&(c==false)){
		return false;
	}
	if(((a>0)||(a<0))&&((b<0)||(b>0))&&(c==false)){
		
	return true;
	}
	if ((a<0&&b<0)&&(c==true)){
		
		return true;
	}
	
	if((a<0&&b>0)&&(c==false)){
	
	
		return true;
	}
	if((a>0&&b>0)&&(c==true)){
		return false;
	}

	return false;
}
}