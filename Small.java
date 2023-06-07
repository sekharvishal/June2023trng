import java.util.Scanner;
class Small{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a,b,c;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if((a<b)&&(a<c)){System.out.println(a);}
else if((b<a)&&(b<c)){System.out.println(b);}
else{System.out.println(c);}
}
}