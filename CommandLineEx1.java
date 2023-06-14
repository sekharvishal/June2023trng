class CommandLineEx1{
public static void main(String []args){

System.out.println("Your first argument is : "+args[0]);
System.out.println("Your second argument is : "+args[1]);
System.out.println("Your third  argument is : "+args[2]);
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);

//System.out.println(args[0]+args[1]);
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
}
}