import java.util.Scanner;
class Fib{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the value ");

int n=s.nextInt();
int a=0;
int b=1,sum=0;
while(sum<=n){


System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;
}
}
}


