public class Teststringcomparison{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin";
String s3=new String("saChin");
String s4="Saurav";
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equalsIgnoreCase(s4));

}

}