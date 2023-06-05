import java.util.Scanner;
public class Mul{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int  n,m,v;
char cm=',';
 n= s.nextInt();
v=s.nextInt();
char d;// simply 
for(m=0;m<=n;m=m+v){
System.out.print(m);
if(m<=n-1){
System.out.print(cm);
}
}
}
}
