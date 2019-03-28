import java.util.*;
class program1{
public static void main(String[] args){
System.out.println("enter a trueisinput");
Scanner sc= new Scanner(System.in);
boolean value=sc.nextBoolean();
program1 p1=new program1();
p1.getprint(true);
System.out.println("end of main method");
}
void getprint(boolean a){
if(a){ 
System.out.println("hello");
}
}
}