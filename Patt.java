import java.util.Scanner;
class Patt{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
line(n);
}
public static void line(int n){ 
for(int i=1;i<=n;i++)
{col(i);}

}
public static void col(int i){
System.out.println();

for(int j=1;j<=i;j++){
System.out.print(j);}
}


}
