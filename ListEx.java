import java.util.List;
import java.util.ArrayList;
class ListEx{
public static void main(String[]args){
List<Integer>num=new ArrayList<>();
num.add(1);
num.add(2);
num.add(8);
num.add(4);

System.out.println("List : "+num);
int numb=num.get(2);
System.out.println("Accessed Element: "+numb);
int rem=num.remove(1);
System.out.println("Removed Ele : "+rem);
System.out.println("List: "+num);
}
}