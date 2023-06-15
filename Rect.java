interface Drawble{
void draw();
}
class Rectangle implements Drawble{
public void draw(){System.out.println("drawing rectangle");} 
}
class Circle implements Drawble{
public void draw(){System.out.println("drawing circle ");}

}
class TestInterface1{
public static void main(String[]args){
//Drawble d=new Circle();
//d.draw();
Drawble d=new Rectangle();
d.draw();

}
}