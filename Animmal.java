class Animal{
Animal(){System.out.println("animal is created");}
}
class Dog extends Animal{
Dog(){
System.out.println("Dog is created");
}}
class Testsuper4{
public static void main(String[]args){
Dog d=new Dog();
}
}