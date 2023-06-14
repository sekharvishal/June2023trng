import java.io.*;
public class Bufff{
public static void main(String[]a)throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(r);
String name="";
while(!name.equals("stop")){
System.out.println("Enter data: ");
name=b.readLine();
System.out.println("data is : "+name);
}
b.close();
r.close();
}
}