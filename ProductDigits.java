import java.util.Scanner;
class ProductDigits{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int res=1;
System.out.println("Enter the  digit");

int num=s.nextInt();
while(num>0){
res=res*(num%10);
num=num/10;
}
System.out.println("Product of the  digits: "+res);
}
}

