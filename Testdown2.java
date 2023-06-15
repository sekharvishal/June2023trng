class TestShutdown2{
public static void main(String[]args){
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new Thread(){


public void run(){
System.out.println("shut down hook task completed ..");
}
}
);
System.out.println("Now main sleeping ... Press ctrl+c to exit");
try{
Thread.sleep(30000);}
catch(Exception e){}
}
}