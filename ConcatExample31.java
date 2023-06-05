class ConcatExample31{
public static void main(String args[]){
String s1= new String("Hello");
String s2=new String("Java");
String s3=new String("Reader");

String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
System.out.println(s4);
String s5=s1.concat("!!!");
System.out.println(s5);
String s6=s1.concat("@").concat(s2);
System.out.println(s6);
}
}