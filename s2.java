class s2{
void  m(s2 o){
System.out.println("method is invoked ");
}
void  p(){
m(this);
}
public static void main(String  []args){
s2 s1=new s2();
s1.p();
}
}