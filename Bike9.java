class Bike9{
final int Speedlimit=90;//caannot assign variable to the final variable 
void run(){
Speedlimit=400;
System.out.println(Speedlimit);
}
public static void main(String[]args){
Bike9 obj=new Bike9();
obj.run();
}
}