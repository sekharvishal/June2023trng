//Example of multilevel Inheritance
//Example of  single Inheritance
class Animal1{
void eat(){System.out.println("Eating.......");}}

class Dog extends Animal1{
void bark(){System.out.println("barking.....");}}

class  BabyDog extends Dog{
void weep(){System.out.println("Weeping....."); }
}

class TestInheritance{
public  static void main(String[]args){
BabyDog d=new BabyDog();


//Animal a=new Animal();
d.bark();
d.eat();
d.weep();
}
}