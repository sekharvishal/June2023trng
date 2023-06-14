import java.util.Scanner;
import java.util.Arrays;
class Array{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int[] a;
int sum=0;
int n=s.nextInt();
a=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.print(a[0]);
System.out.println(" "+a[n-1]);
System.out.println("  "+a[n-2]);
for(int num:a){
sum+=num;
}
double avg=((double)sum/(double)(n-1));
System.out.println(sum);
System.out.println(avg);
}
}