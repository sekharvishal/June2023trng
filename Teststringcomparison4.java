public class Teststringcomparison4{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin";

String s3="Ratan";
System.out.println(s1.compareTo(s2));//  true reference is same
System.out.println(s1.compareTo(s3));
System.out.println(s3.compareTo(s1));//  falsebreferencezare not same
}}