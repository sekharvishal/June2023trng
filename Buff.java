import java.io.*;
class Buff{
public static void main(String[]a)throws Exception{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
int d=b.readInt();
int  c=b.readInt();
System.out.print(d+c);
}
}