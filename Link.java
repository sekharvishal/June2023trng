import java.util.List;
import java.util.LinkedList;
class Link{
public static void main(String[]args){
List<Integer>num=new LinkedList<>();
num.add(1);
num.add(2);
num.add(3);
num.add(4);
System.out.println("List : "+num);
int numn=num.get(2);
System.out.println("Acessed of 3 is "+numn);
int index=num.indexOf(2);
System.out.println("Position of 3 is "+index);
int rem=num.remove(2);
System.out.println("Removed element"+rem);
System.out.println(num);
}
}