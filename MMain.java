import java.util.ArrayList;
class MMain{
public static void main(String []args){
ArrayList<String>animals=new ArrayList<>();
animals.add("Dog");
animals.add("Cat");
animals.add("Horse");
animals.add("Dheeraj");
System.out.println("Array List:  "+animals);
animals.remove("Dheeraj");
System.out.println("Array List:  "+animals);
System.out.println(animals.size());

}
}