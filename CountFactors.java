import java.util.*;
class CountFactors{
public static  void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println();
int c=0;
for(int i=1;i<=a;i++){
if(a%i==0){c++;
System.out.print(i);
if(i!=a)System.out.print(",");}}

System.out.println("\n\nCount of Factors is :"+c);
if (c==2){
System.out.println("\nIS A PRIME");}
else{System.out.println("\nNOT A PRIME");}
}
}