class Bike1{
// final void run(){System.out.println("running");} reports error

void run(){System.out.println("Running");}
}
class Bullet extends Bike1{
void run(){System.out.println("running safetly with 100kmph");}
public static void  main(String[]args){
Bullet b=new Bullet();
b.run();

}
}