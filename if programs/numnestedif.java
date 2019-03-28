import java.util.*;
class numnestedif {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
	     int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		System.out.println("enter c value");
		int c = sc.nextInt();
		System.out.println("enter d value");
		int d = sc.nextInt();
		 // if(maxnumber(a,b,c,d)){
		 // 	System.out.println("biggest number is");
		 // 	if(minumber(a,b,c,d)){
		 // 		System.out.println("biggest number is");
		 // 	}
		 // 	else{
		 // 		System.out.println("lowest number is");
		 // 	}
		 // }
		 // else{
		 // 	System.out.println("lowest number is");
		 // }
		int maxValue = maxnumber(a,b,c,d);
		System.out.println("maxnumber amoung 4: "+maxValue);
		int minValue = minumber(a,b,c,d);
	    System.out.println("minnumber amoung 4: "+minValue);


	}
	public static int  maxnumber(int a,int b,int c,int d){
		
		if(((a>b)&&(a>c)&&(a>d))){
		      return a;
		}
		if((b>c)&&(b>d)){
			return b ;
		}
		if((c>d)){
			return c;
		}
		return d ;
}
public static int minumber(int a,int b,int c,int d){
		
		if(((a<b)&&(a<c)&&(a<d))){
		      return a;
		}
		if((b<c)&&(b<d)){
			return b ;
		}
		if((c<d)){
			return c;
		}
		return d ;
}

}
