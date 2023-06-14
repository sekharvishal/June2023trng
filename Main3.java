import java.util.ArrayList;
class Main3{
public static void main(String[]args){
ArrayList<String>lang=new ArrayList<>();
lang.add("java");
lang.add("c");
lang.add("C++");
System.out.println("ArrayList : "+lang);
lang.set(2,"JavaScript");
System.out.println("modified ArrayList : "+lang);
}
}