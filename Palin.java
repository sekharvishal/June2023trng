import java.util.Scanner;
class palin{
public static void main(String[]args){
Scanner  s=new Scanner(System.in);
String v=s.nextLine();
// v=v.toLowerCase();
//v=v.toUpperCase();
String r="";
for (int i=0;i<=v.length()-1;i++){
r=v.charAt(i)+r;
}
System.out.println(r);
if(v.equalsIgnoreCase(r))System.out.print("YES");
else System.out.print("NO");
}
}

