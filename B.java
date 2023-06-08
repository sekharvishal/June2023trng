class B{
A obj;
B(A obj){
this.obj=obj;
}
void display(){System.out.println(obj.data);}
}
class A(){
B b=new B(this);
b.display();
}

public static void main(String[]args){
A a=new A();
}
}


