import java.util.Scanner;
class Replace{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String c=s.next();
String e=s.next();
String d=str.replaceAll(c,e);
System.out.print(d);
}}