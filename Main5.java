import java.util.ArrayList;
class Main5{
public static void main(String[]args){
ArrayList<String>ani=new ArrayList<>();
ani.add("cow");
ani.add("Cat");
ani.add("Dog");
System.out.println("arrayList : "+ani);
System.out.println("Acessing individually ");
for(String temp:ani){

System.out.print(temp);
System.out.print(",");
}
}
}
