import java.util.Scanner;
class Power{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a,d,res;
res=1;
System.out.println("Enter the base element");
a=sc.nextInt();

System.out.println("Enter the power element");

d=sc.nextInt();
for(int i =1;i<=d;i++){
res *=a;
}
System.out.print(a+" power "+d+" is "+res);
}
}