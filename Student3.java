class Student2{
public int id;
public  String name;
private void display(){
System.out.println(this.id+" "+this.name);

}
public void displayStudent(){display();}
}
class Test{
public static void main(String args[]){
Student2 ob=new Student2();
System.out.println(ob.id+"  "+ob.name);
ob.id=25841;
ob.name="Vishal";
ob.display();
System.out.println(ob.id+" "+ob.name);
}
}
