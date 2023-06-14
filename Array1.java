import java.util.Scanner;
import java.util.Arrays;
class Array1{
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

System.out.println(a[n-2]);


}
}