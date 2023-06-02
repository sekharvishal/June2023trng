import  java.util.*;
public class program204{
static int diff(int a,int b){return a-b;}
static int mul(int a,int b){return a*b;}
static int smallest(int a,int b){
if(a<b)return a;
if(b<a)return b;
return 0 ;
}
static int largest(int a,int b){
if (a>b) return a;
if (b>a) return b;
return 0 ;
}

public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n1,n2,result ;
System.out.println(" Enter the number :");
n1=sc.nextInt();
System.out.println(" Enter the number :");
n2=sc.nextInt();
result=diff(n1,n2);
System.out.println(result);
result=mul(n1,n2);
System.out.println(result);
result=smallest(n1,n2);
System.out.println(result);
result=largest(n1,n2);
System.out.println(result);


}	  
 
}

