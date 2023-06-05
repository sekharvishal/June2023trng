class Employee{
int id;
String name;
float  salary;
void insert(int i,String n,float s){

id=i;
name=n;
salary=s;
}
void displayInformation(){System.out.println(id+"  "+name+"  "+salary);}
}
class TestEmployee{
public static void main(String args[]){
Employee e1;
e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(2,"v",200000);
e2.insert(3,"b",300000);
e3.insert(4,"c",40000);
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}
