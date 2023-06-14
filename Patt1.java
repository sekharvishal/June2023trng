import java.util.Scanner;
class Patt1{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++){
for(int j=0;j<i;j++){
System.out.print(j+i);
}
System.out.println();
}
}}
