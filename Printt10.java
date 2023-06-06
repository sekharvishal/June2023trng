import java.util.Scanner;
class Printt10{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int v=1;
int c=s.nextInt();

while(v<=c){
System.out.print(v);
v++;
if (v<=c){System.out.print(",");}
}
}
}
