class Student1{
int rollno;
String name;
static String college="ITS";
static void change(){

college="A.Mreddy";

}
Student1 (int rollno,String name){
this.rollno=rollno;
this.name=name;
}
void display(){System.out.println(rollno+" "+name+" "+college);}

}
 class TestStaticMethod{
public static  void main(String[]args){

Student1 s1=new Student1(111,"Vishal");
Student1 s2=new Student1(222,"ccccccc");
Student1.change();
Student1 s3=new Student1(333,"bbbbbb");
s1.display();
s2.display();
s3.display();
}
}
 