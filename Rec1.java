import java.util.Scanner;
class  Rec{
int len;
int wid;
void insert( int l,int w){
len=l;
wid=w;
}
void calculateArea(){System.out.println(len*wid);}
}
class TestRec1{
public static  void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length");
int ll=sc.nextInt();
System.out.println("Enter the width");
int ww=sc.nextInt();


Rec r1=new Rec(), r2=new Rec();
r1.insert(ll,ww);
r2.insert(3,15);
r1.calculateArea();
r2.calculateArea();
}
}