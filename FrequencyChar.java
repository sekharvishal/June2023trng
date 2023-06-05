import java.util.Scanner;
public class FrequencyChar {
public static void main(String args[]){
Scanner v=new Scanner(System.in);
String str=v.nextLine();
char ch=v.next().charAt(0);

int c=0;
for(int i=0;i<=str.length()-1;i++){
 if(str.charAt(i)==ch){
  c++;
}
}
System.out.println(c);
}
}