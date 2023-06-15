class Person{
protected String fname="Vishal ";
protected String lname="Sekhar";
protected int age=19;
}
class Student extends Person{
private int graduationYear=2025;
public static void main(String[]args){
Student myObj=new Student();
System.out.println("Name "+myObj.fname+" "+myObj.lname);
System.out.println("Age: "+myObj.age);
System.out.println("Graduation Year : "+myObj.graduationYear);
}
}