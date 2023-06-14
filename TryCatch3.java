import java.io.FileNotFoundException;
import java.io.PrintWriter;
class TrycatchExample3{
public static void main(String[]args){
PrintWriter pw;
try{
pw=new PrintWriter("jtp.txt");
pw.println("saved");
}
catch(FileNotFoundException e){
System.out.println(e);
}
System.out.println("File saved sucessfully");
}
}

