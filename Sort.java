import java.util.Scanner;
import java.util.Arrays;
class Sort{
static public void main(String[]args){
Scanner s=new Scanner(System.in);
int n,i=0;

 n=s.nextInt();
int [] a=new int[n];

System.out.println("Enter the  Elements ");
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
for(i=0;i<a.length;i++){
for(int j=0;j<a.length;++j){
int temp=0;
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int x:a) System.out.print(x+" ");
}
} 
