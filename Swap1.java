import java.util.Scanner;
public class Swap1{
public static void main(String []args){
Scanner v=new Scanner(System.in);
int  num1,num2,temp;
System.out.println("INPUT:");
num1=v.nextInt();
num2=v.nextInt();
String sp=new String();
sp=" ";
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;

System.out.println("OUTPUT:");
System.out.print(num1+sp+num2);
}
}
