import java.util.Scanner;
class  PalindrometoLower{
public static void main(String[]args){
Scanner s=new  Scanner(System.in);
String str=s.nextLine();
String temp="";
int ascii;
for (int i=str.length()-1;i>=0;i--){
if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
ascii=str.charAt(i);
ascii+=32;
temp=temp+(char)ascii;
}
else
{
temp=temp+str.charAt(i);
}
}
System.out.println("temp:"+temp);
str=temp;
String rev="";
for(int  i=str.length()-1;i>=0;i--){rev=rev+str.charAt(i);}
if(str.equals(rev)){
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}

