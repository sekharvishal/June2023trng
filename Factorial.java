import java.util.Scanner;
class Factorial{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int i,j,h;
h=1;
j=s.nextInt();
for(i=1;i<=j;i++){
System.out.print(i);
h=h*i;
if(i<j){System.out.print("*");}
}
System.out.println("="+h);
System.out.print("  Factorial : "+h);
}
}