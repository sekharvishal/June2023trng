import java.util.Scanner;
class Pattern2{
public static void PrintLine(char c,int col){

System.out.println();
for(int j=1;j<=col;j++){
System.out.print(c);

}

}
public static void printPattern(char c,int n){
for (int i=1;i<=n;i++){
PrintLine(c,i);
}
}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
int row=s.nextInt();
printPattern(ch,row);
}
}