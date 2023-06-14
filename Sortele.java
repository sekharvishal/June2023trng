import java.util.*;
import java.util.Arrays;
class Sortele{
public  static void main(String[]args){
Scanner s=new Scanner(System.in);
int n,i=0;
System.out.println("Enter the no.of Elements you want in array: ");
n=s.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println("INCREASING ORDER");
for(int k:a){
System.out.print(k+"  ");
}
System.out.println("\n DECREASING ORDER");
for(int j=a.length-1;j>=0;j--)
System.out.print(a[j]+"  ");


}} 