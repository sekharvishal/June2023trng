import java.util.*;
public class program206
{
public static void main(String[]args)
{
char  ch;
	System.out.print("Enter the character");
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	int n;
	n=(int)ch;
	System.out.println("ASCII of "+ch+" is " +n);
	}
}
