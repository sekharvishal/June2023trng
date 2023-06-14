class First implements Runnable{
Thread t;String S;
First(String Name){
S=Name;
t=new Thread(this,S);
System.out.println("CHID: "+t);
t.start();
}
public void run(){
try{ for(int i=5;i>0;i--){
System.out.println(S+" "+i);
Thread.sleep(1000);}
}
catch(InterruptedException e){}
System.out.println("EXITING "+S);
}
}class Secound
{
public static void main(String []args)throws Exception {
new First("ONE");
new First("TWO");
new First("THIRD");
try{
Thread.sleep(20000);
}
catch(InterruptedException e){}
System.out.println("EXTING MAIN ");
}
}