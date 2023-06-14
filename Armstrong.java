import java.util.Scanner;
import java.io.*;
class Armstrong{

public static int len(int n){
int c=0;
while(n>0){
n=n/10;
c++;
}
return c;
}
static public boolean checkArm(final int n){
int sum=0;
int exp=len(n);
int num=n;
while(num>0){
sum+=Math.pow((num%10),exp);
num=num/10;
}
return n==sum;
}


public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int l=0;
if(checkArm(a)==true){
System.out.println("YES");
}

else{
System.out.println("NO");}
}
}
