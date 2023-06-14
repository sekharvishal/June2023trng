import java.util.Scanner;
class Dia{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
int a=s.nextInt();
Pattern(c,a);
Pattern1(c,a);
}
public static void Pattern(char c, int n){
for(int i=(n/2), j=1;j<=n;i--,j+=2){Print(c,i,j);}
}

public static void Pattern1(char c, int n){
for(int i=1, j=n-2;j>0;i++,j-=2){Print(c,i,j);}
}
public static void Print(char c,int n1,int n2){

char c1='#';
System.out.println();
for(int i=0;i<n1;i++)System.out.print(c1);
for(int i=0;i<n2;i++)System.out.print(c);
for(int i=0;i<n1;i++)System.out.print(c1);
}}