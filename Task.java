class Task extends Thread{
String threadName;
public  Task(String name){threadName=name;}
public void run(){if (Thread.currentThread().isDaemon())
{System.out.println(threadName+" is Daemon Thread");}
else{System.out.println(threadName+"  is user Thread");}
}
public static  void main(String[]args){
Task thread1=new Task("thread 1 ");
Task thread2=new Task("thread 2");
thread1.setDaemon(true);
thread1.start();
thread2.start();
}}

 