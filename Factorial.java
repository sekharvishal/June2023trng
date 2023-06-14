import  java.util.Scanner;
class Factorial{
public static  int calculateFact(int n){
if(n==0)return 1;
else return n*calculateFact(n-1);
}
//calculateFact
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a>0)
System.out.println(calculateFact(a));
else
System.out.println("INVALID");

}
}
