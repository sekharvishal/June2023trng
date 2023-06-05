import java.util.Scanner;
class Calculation{
void fact(int n){
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial is "+fact);
}
public static void  main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the digit: ");
int d=sc.nextInt();
new Calculation().fact(d);
}
}