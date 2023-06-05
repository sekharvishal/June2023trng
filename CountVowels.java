import java.util.Scanner;
public class CountVowels {
public static void main(String args[]){
Scanner v=new Scanner(System.in);
String str=  v.nextLine();
int c=0;
for(int i=0;i<=str.length()-1;i++)
{
if((str.charAt(i)=='a')||(str.charAt(i)=='e')||
(str.charAt(i)=='i')||(str.charAt(i)=='o')||
(str.charAt(i)=='u')||(str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||
(str.charAt(i)=='O')||(str.charAt(i)=='u')){
  c++;
}
}
System.out.println(c);
}
}
