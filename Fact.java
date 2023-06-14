import java.util.Scanner;
class Fact{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for (int i=1;i<=a;i++){
if (a%i==0){
System.out.print(i);
}
}
}
}