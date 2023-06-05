public class Teststringcomparison3{
public static void main(String args[]){
String s1="Sachin";
String s2="SachIn";
String s3=new String("Sachin");
String s4="Saurav";
System.out.println(s1==s2);//  true reference is same
System.out.println(s1==s3);//  falsebreferencezare not same
}}