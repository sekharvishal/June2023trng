class B1{
A obj;
B1(A obj){
this.obj=obj;
}
void display()
{System.out.println(obj.data);}
}

class A{
int data=10;
A(){
B1 b=new B1(this);
b.display();
}

public static void main(String[]args){
A a=new A();
}
}


