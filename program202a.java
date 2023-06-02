import  java.util.*;
public class program202a{
public static boolean isEven(int n)
{
return((n/2)*2==n);
}

public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println(" Enter the number :");
n=sc.nextInt();
if(isEven(n)){
            System.out.println("Even");
 	    System.out.println(n+"is Even  \n");
          }
else
	  {
	    System.out.println("Odd");
	    System.out.println(n+"is Odd  \n");
	  
 
}
}
}
