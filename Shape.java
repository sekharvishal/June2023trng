abstract class Shape{
abstract void draw();
}
class Rectangle extends Shape{
void draw(){System.out.println("Drawing rectangle");}
}
class Circle extends Shape{
void draw(){System.out.println("drawing circle");}
}
class TestAbs{

public static void main(String []args){
Shape s=new Circle();
Shape c=new Rectangle();
s.draw();
c.draw();
}
}