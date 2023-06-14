import java.io.*;
public class BufferedReaderEx{
public static void main(String[]a) throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Enter the name");
String name=br.readLine();
System.out.println("Welcome"+name);
}
} 