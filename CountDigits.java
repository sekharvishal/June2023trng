import java.util.Scanner;
public class CountDigits {
public static void main(String args[]){
Scanner v=new Scanner(System.in);
String str=  v.nextLine();
int c=0;
for(int i=0;i<=str.length()-1;i++)
{
if((str.charAt(i)=='1')||(str.charAt(i)=='2')||
(str.charAt(i)=='3')||(str.charAt(i)=='0')||
(str.charAt(i)=='5')||(str.charAt(i)=='6')||(str.charAt(i)=='7')||(str.charAt(i)=='8')||
(str.charAt(i)=='9')||(str.charAt(i)=='4')){
System.out.print()  ;
c++;
}
}
System.out.print("\n "+c);;
}
}
