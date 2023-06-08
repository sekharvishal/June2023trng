class Student{
int rollno;
String name;
static String college="MTIET";
Student (int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
 class TestVariable1{
public static void main(String []args){
Student s1=new Student(499,"VISHAL");
Student  s2=new Student(111,"SSS");
s1.display();
Student.college="VISHAL clg";

s2.display();
}
}
