import  java.util.Scanner;
class Pattern5{
public static void main(String[]args){
Scanner  s=new Scanner(System.in);
char ch=s.next().charAt(0);
int row=s.nextInt();
int  x,y;
if(row%2==0){

x=(row/2);
y=(row/2);
}
else{
x=row/2;
y=row/2+1;
}

//PrintReverse(ch,y);
printPattern(ch,x);

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
int i,j;
for ( i=1;i<=n;i++){System.out.print(" ");}
for(j=n;j>=1;j--){System.out.print(c);}
}
}
 