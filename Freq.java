import java.util.Scanner;
class Freq{
public static void main(String []  args){
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
char ch=sc.next().charAt(0);
int c=0;
for(int i=0;i<=str1.length()-1;i++){
if(str1.charAt(i)==ch){
c++;
}
}
System.out.println(c);
}
}