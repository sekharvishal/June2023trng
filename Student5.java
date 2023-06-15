class Student5{
private int age;
private String name;
private String getName(){return this.name;}
private int getAge(){return this.age;}
private void  setName(String name){
if(name.length()>0) this.name=name;
else System.out.println("Name cannot be empty");
}
private void setAge(int age ){this.age=age;}
public void display(){
System.out.println(getName()+" , "+getAge());
}
public void inputStudentDetails(String n,int a){
setName(n);
setAge(a);
}
}
class Test{
public static void main(String args[]){
Student5 obs1=new Student5();
obs1.inputStudentDetails("vishal",19);
Student5 obs2=new Student5();
obs2.inputStudentDetails("",18);
obs2.display();
}
}