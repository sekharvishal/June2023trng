import java.util.Scanner;
class ReverseStringPalindrome{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String rs="";
System.out.println("\n \nEnter the  String \n \n ");

String str=s.next();
int len=str.length()-1;
for(int  i=len;i>=0;i--){
rs=rs+str.charAt(i);

}
System.out.println("\n \nreverse of "+str+" is "+rs);
if(str.equals(rs)){System.out.println(rs+" is  palindrome");}
else {System.out.println(rs+" is not Palindrome");}
}
}

