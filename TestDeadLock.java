class TestDeadlockExample{
public static void main(String[]a){
final String resource1="VISHAL";
final String resource2="ANOTHER";
Thread t1=new Thread() {

public void run(){
synchronized(resource1){
System.out.println("Thread 1: locked resource 1");
try{Thread.sleep(1000);}catch(Exception e){}
synchronized(resource2){
System.out.println("Thread 2: locked resource 2 ");
}
}

}};
Thread t2=new Thread(){
public void run(){
synchronized(resource2){
System.out.println("Thread 1:locked resource 2");
try{Thread.sleep(10000);}catch(Exception e){}
synchronized(resource1){
System.out.println("Thread 2: locked resource 1");
}
}
}
};
t1.start();
t2.start();
}
}