import java.util.Scanner;
class Pattern1{
public static  void printpattern(char c,int n){
for(int i=0;i<n;i++){
System.out.println();
for(int j=0;j<=i;j++){

System.out.print(c);
}
}
}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
int row=s.nextInt();
printpattern(c,row);
}
}