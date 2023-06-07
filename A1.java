class A1{
A1(){System.out.println("hello a");}
A1(int x){
this();
System.out.println(x);
}
}
class TestThis5{
public static void main(String args[]){
A1 x=new  A1(10);
}}