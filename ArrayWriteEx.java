import java.io.CharArrayWriter;
import java.io.FileWriter;
class CharArrayWriteEx{
public static void main(String []args)throws Exception{
CharArrayWriter out=new CharArrayWriter();
out.write("Welcome to this trainning");
FileWriter f1=new FileWriter("E:\\fh\\a.txt"); 
FileWriter f2=new FileWriter("E:\\fh\\b.txt"); 
FileWriter f3=new FileWriter("E:\\fh\\c.txt"); 
FileWriter f4=new FileWriter("E:\\fh\\d.txt");
out.writeTo(f1);       out.writeTo(f2);
out.writeTo(f3);       out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();

System.out.print("sucess....");
}
}