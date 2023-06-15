class MyThread extends Thread{
public void run(){
System.out.println("Shut down hook taskcompleted..");
}}
class TestShutDown{
public static void main(String[]args)throws Exception{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new MyThread());
System.out.println("Now main sleeping......Press ctrl+c to exit");
try{
Thread.sleep(30000);}
catch(Exception e){
}
}}