// polymorphism
import java.util.Scanner;
class polyex1{
void print(){System.out.println("Welcome");}

void print(String n){System.out.println("Welcome  "+n);}
void print(String n,String nn){System.out.println("Welcome  "+n+" "+nn);}
}
class Test{
public static void main(String[]args){
polyex1 ob=new polyex1();
Scanner s=new Scanner(System.in);
String st=s.next();
String sn="goodmorning";

ob.print();
ob.print(st);
ob.print(st,sn);
}
}
