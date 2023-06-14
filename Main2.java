import java.util.ArrayList;
class Main2{
public static void main(String[]args){
ArrayList<String>ani=new ArrayList<>();
ani.add("Cat");
ani.add("Dog");
ani.add("Cow");
ani.add("Goat");
String  str=ani.get(1);
System.out.println("Element at index  1:"+str);
str=ani.get(2);
System.out.println("Elements at index 2 :"+str);
}
}