import java.util.Scanner;

class Inputswap1{


public static void main(String args[])
{
Scanner scob=new Scanner(System.in);

int num1;
num1=scob.nextInt();

int num2;
num2=scob.nextInt();

int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.print(  num1 +"\n"+num2);


}
}