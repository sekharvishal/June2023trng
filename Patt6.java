import java.util.Scanner;
class Patt6{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int k=0;
for(int i=0;i<=a;i++){
for(int j=0;j<=i;j++){
if(k<=a){
System.out.print(k);
k++;
}
if(k<=a){
System.out.print(",");
}
}
System.out.print("\n");
}

}}
