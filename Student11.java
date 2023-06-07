class Student11{
int rollno;
String  name;
float fee;
Student11(){};

Student11(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;

}
void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis2{
public static void main(String[]args){
Student11 s1=new Student11(495,"VISHAL",50000);
Student11 s2=new Student11();
s2.rollno=478;
s2.name="ROHIT";
s2.fee=10000;
Student11  s3=new Student11(493,"RAMU",4568);
s1.display();
s2.display();
s3.display();
}
}
