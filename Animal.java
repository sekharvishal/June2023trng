//Example of  single Inheritance
class Animal{
void eat(){System.out.println("Eating.......");}}

class Dog extends Animal{
void bark(){System.out.println("barking.....");}}

class TestInheritance{
public  static void main(String[]args){
Dog d=new Dog();
Animal a=new Animal();
d.bark();
d.eat();
}
}