class Animal{
public void move(){System.out.println("Call from Animal class");}
}
class  Wild extends Animal{
public void move(){System.out.println("Call from Wild class ");
}
}
class  Pet extends Animal{
public void move(){System.out.println("Call from pet class ");
}
}
class TestAnimal{
public static void main(String[]args){
Animal a=new Animal();
Animal b=new Wild();
Animal c=new Pet();
a.move();
b.move();
c.move();
}
}
