class Customer {
int amt=10000;
synchronized void withdraw(int amt) {
System.out.println("going to withdraw.....");
if(this.amt<amt){
System.out.println("Less balance : waiting for deposit ...");
try{wait();}catch(Exception e){}
}
this.amt=amt;
System.out.println("Withdraw completed.");
}
synchronized  void deposit(int amt){
System.out.println("going to depposit ....");
this.amt+=amt;
System.out.println("deposit completed ...");
notify();
}
}
class Test{
public static void main(String[]args){
final Customer c=new Customer();
new Thread(){
public void run(){c.deposit(1000000);}
}.start();
}
}
