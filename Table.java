import java.util.Scanner;
public class Table{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int  n,m;
char sp=' ';
 n= s.nextInt();
char d;// simply 
for(m=0;m<11;m++){
System.out.print();
System.out.println(d+sp+"*"+sp+m+"="+(n*m));
}


}
}