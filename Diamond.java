import java.util.Scanner;
class Diamond{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
int row=s.nextInt();
char x='#';
Pattern(ch,row);

}


public static void Pattern(char c,int n){
for(int i=n/2,j=1;j<=n;i--,j+=2)printline(c,i,j);}








public static void printline(char c,int nch1,int nch2){
char ch='#';
System.out.println();
for(int i=0;i<nch1;i++)System.out.print(ch);
for(int i=0;i<nch2;i++)System.out.print(c);
for(int i=0;i<nch1;i++)System.out.print(ch);
}

}