import java.util.Scanner;
class Test{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=s.nextInt();
int b=0;
for(int i=0;i<=n;i+=a){
 b= n-i;
System.out.print(b);
if(b>0){
System.out.print(",");}

}

}
}