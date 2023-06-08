class Bike2{
final void run(){System.out.println("running");}
}
class Ninja extends Bike2{
public static void main(String[]args){
new Ninja().run();
}
}
