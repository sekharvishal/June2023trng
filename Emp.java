class Emp1{
int id;
String name;
Adress adress;
public Emp(int d,String name,Adress adress){
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
Emp e1=new Emp(111,"THARUN",adress1);
Emp e2=new Emp(22,"VVVVV",adress2);
e1.display();
e2.display();
}
}