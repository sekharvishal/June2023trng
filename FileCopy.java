import java.io.*;
import java.io.FileWriter;
import java.io.CharArrayWriter;
class FileCopy{
public static void main(String[]args)throws Exception{
CharArrayWriter out=new CharArrayWriter();
FileReader fr=new FileReader("E:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
FileWriter fc=new FileWriter("E:\\fh\\e.txt");
int i;
while((i=br.read())!=-1){
out.write((char)i);}

out.writeTo(fc);
fr.close();
fc.close();
System.out.println("SUCESS........");
}
}
