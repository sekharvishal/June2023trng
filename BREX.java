import java.io.*;
class BufferedReaderEx{
public static void main(String[]a){
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Enter the name");
String name=br.readLine();
System.out.println("Welcome"+name);
}
} 