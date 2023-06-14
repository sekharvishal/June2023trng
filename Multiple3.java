class MultipleCatch{
public static void main(String[]args){
try{
String s=null;
System.out.println(s.length());
}
catch(ArithmeticException e){
System.out.println("Arithmetic Exception Occurs");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array fault");
}
catch(Exception e){
System.out.println(e);
}
System.out.println("restmof code........");


}}