class  A2{
A2(){
this(9);
System.out.println("Hello a");
}
A2(int x){
System.out.println(x);
}

}
class TestThis6{
public static void main(String[]args){
A2 a=new A2();
}
}