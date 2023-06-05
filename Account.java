class Account{
int acc_no;
String name;
float amount;
void insert(int a,String n,float amt){
acc_no=a;
name=n;
amount=amt;
}
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println(amt+"Insufficent Balance");}
else{
System.out.println(amt+"Withdraw");
}
}
void checkbalance(){System.out.println("balance is  "+amount);}
void display(){System.out.println(acc_no+" "+name+" "+amount);}
}
class  TestAccount{
public static void main(String[] args){
Account a1=new Account();
a1.insert(832345,"vishal",1000);
a1.display();
a1.checkbalance();
a1.deposit(40000);
a1.checkbalance();
a1.withdraw(15000);
a1.checkbalance();
}
}

