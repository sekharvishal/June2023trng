//Example of multilevel Inheritance
//Example of  Hierarical Inheritance
class Animal2{
void eat(){System.out.println("Eating.......");}}

class Dog extends Animal2{
void bark(){System.out.println("BowBow.....");}}

class  Cat extends Animal2{
void meow(){System.out.println("Memow....."); }
}

class TestInheritance{
public  static void main(String[]args){
Dog d=new Dog();
Cat c=new Cat();
c.meow();
c.eat();




//Animal a=new Animal();
d.bark();
d.eat();
}
}