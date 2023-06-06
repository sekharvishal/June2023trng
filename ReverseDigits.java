import java.util.Scanner;
class ReverseDigits{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int res=0;
System.out.println("\n \nEnter the  digit \n \n ");

int num=s.nextInt();
while(num>0){
res=res*10+(num%10);
num=num/10;

}
System.out.println("\n \nReverse of the  digit is: "+res);
}
}

