class Tri{
int height;
int base;
void insert(int h,int b){
height=h;
base=b;
}
void display(){System.out.println(0.5*height*base);}
}
class TestTri{
public static void main(String[] args){
Tri t1=new Tri(),t2=new Tri();
t1.insert(11,12);
t2.insert(34,45);
t1.display();
t2.display();
}
}