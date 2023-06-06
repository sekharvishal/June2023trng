import java.util.Scanner;
class ReverseDigitPalindrome1{
public static void main(String[]args){
//Scanner s=new Scanner(System.in);
int res=0;
//System.out.println("\n \nEnter the  digit \n \n ");
int n;

int temp ;
for(n=100;n<=1000;n++){
while(n>100){
res=res*10+(n%10);
n=n/10;

}
System.out.println("\n \nReverse of the  digit is: "+res);

if(n==res){System.out.println("palindrome");}
else {System.out.println("Not Palindrome");}
}}
}

