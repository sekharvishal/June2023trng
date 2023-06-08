class Emp1{
int id;
String name;
Adress adress;
public Emp1(int id,String name,Adress adress){
this.id=id;
this.name=name;
this.adress=adress;
}
void display(){
System.out.println(id+" "+name);
System.out.println(adress.city+" "+adress.state+" "+adress.country);
}
public static void main(String[]args){
Adress adress1=new Adress("palamaner","AP","INDIA");
Adress adress2=new Adress("chittoor","AP","INDIA");
Emp1 e1=new Emp1(111,"VISHAL",adress1);
Emp1 e2=new Emp1(22,"VVVVV",adress2);
e1.display();
e2.display();
}
}