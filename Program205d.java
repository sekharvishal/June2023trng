import java.util.*;
public class Program205d
{
public static void main(String[]args)
{ char ch;
System.out.println("Enter a character:");

Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if(ch>='0'&&ch<='9')
System.out.println(ch+"is an digit \n");

else if((ch>='a'&&ch<='z')||( ch>='a'&&ch<='z'))
System.out.println(ch+"is an alphabet \n");
else 
System.out.println(ch+"is a  special character \n");

}}

