import java.util.Scanner;
class DigitsPalindrome{
public static void main(String[]args){
Scanner ramu=new Scanner(System.in);
int a=ramu.nextInt();
int temp=a;
int re=0;
while(a>0){
re=re*10+(a%10);
a=a/10;
}
System.out.println(re);
if (temp==re){System.out.println("palindroime");}
else{System.out.println("not a palindrome");}
}
}

