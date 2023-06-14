import java.util.Scanner;
class Pattern{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
int a=s.nextInt();
char d='#';
a=a-1;
for(int i=0;i<=a;i++){
for(int j=(a-i);j>0;j--){
System.out.print(d);}
for(int k=0;k<=i;k++){
System.out.print(c);}

System.out.println();}
}
}