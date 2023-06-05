class Student11{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}

void displayinformation(){ System.out.println(rollno+" "+name);}
}
class TestStudent4{
public static void main(String[] args){
Student11 s1=new Student11();
Student11 s2=new Student11();
s1.insertRecord(111,"vishal");
s2.insertRecord(222,"vvv");
s1.displayinformation();
s2.displayinformation();
}
}
