import java.util.Scanner;
class Arm{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
 int a=s.nextInt();
int b=a;
int  len=0;
int sum=0;
System.out.println(a);
while(a>0){
a=a/10;
len++;
}
 a=b;
while(a>0){
sum+=Math.pow((a%10),len);
a=a/10;
}
 
if(sum==b){
System.out.println("YES");}
else{
System.out.println("NO");}
}
}
