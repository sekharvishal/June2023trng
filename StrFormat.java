class StrFormat{
public static void main(String args[]){
String s1= new String(" S ");
String s2=new String(" Vishal");
String s3=new String(" Welcome");
String s4=new String(" String Format");
String s=String.format("%s %s",s1,s2);
String r=String.format("%s %s",s3,s4);
System.out.print(s.toString()+r.toString());
}
}