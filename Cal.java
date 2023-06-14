class cal extends Thread {
public static void main(String []args){
cal obj=new cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Threads inside main are very much helpful");
}
public void run(){
System.out.println("Thread fromoverriden run method are implemented");
}
}