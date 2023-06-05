import java.util.Scanner;
public class Mul1{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int  n,m,v;
char cm=',';
String str="";

 n= s.nextInt();
v=s.nextInt();
char d;// simply 
for(m=0;m<=n;m=m+v){
str=str+m+cm;
}
for(m=0;m<str.length()-1;m++){
System.out.print(str.charAt(m));
}


}
}
