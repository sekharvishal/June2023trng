import  java.util.Scanner;
class Pattern3{
public static void main(String[]args){
Scanner  s=new Scanner(System.in);
char ch=s.next();
int row=s.nextInt();
PrintReverse(ch,row);
}
public static void PrintReverse(char c,int n){
for(int i=n;i>=1;i--){
PrintLine(c,i);
//printPattern(c,i);

}
}
public static void printPattern(char c,int n){
for (int i=1;i<=n;i++){
PrintLine(c,i);
}
}
public static void PrintLine(char c,int n){
System.out.println();
for (int i=1;i<=n;i++){System.out.print(c);}
}
}
 