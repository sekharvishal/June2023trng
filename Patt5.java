import java.util.Scanner;
public class Patt5{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n;
printpatt(a);
}

public static void printpatt(int a){
for(int i =1;i<=a;i++){ patt(i,a);}
}

public static void patt(int i,int a){
int k=0;

System.out.println();
for(int j=1;j<=i;j++)
{

if(k<=a){
System.out.print(j);
k++;

}
if(j<i && k<=a)
System.out.print(",");
}

}
}

