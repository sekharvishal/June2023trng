import java.util.Scanner;
class Excart{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String v=s.nextLine();
String c="";
for(int i=0;i<=v.length()-1;i++){
if(v.charAt(i)>='0' && v.charAt(i)<='9'){
c=c+v.charAt(i);
}
}
System.out.print(c);
}
} 