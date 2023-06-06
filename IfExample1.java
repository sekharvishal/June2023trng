import java.util.Scanner;
class IfExample2{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int i,j;
i=s.nextInt();
j=s.nextInt();
if(j==0)System.out.println("Division by error");
else System.out.println(i+"divided by"+j+"is"+(i/j));
i=i+j;
}
}