import java .io.*;
class Count{
public static void main(String[]args) throws Exception{

FileReader fr= new FileReader("E:\\fh\\demo.txt");
BufferedReader r=new BufferedReader(fr);

int i,c=0,d=0,ff=0;
while((i=r.read())!=-1){
if(((char)i =='a')||((char)i =='e')||((char)i =='i')||((char)i =='o')||((char)i =='u')||
((char)i =='A')||((char)i =='E')||((char)i =='I')||((char)i =='O')||((char)i =='U'))||
{
d++;
}
else if(((char)i>='0') &&(char)i<='9')){}
else{
c++;}
ff++;
}
System.out.println(d);
System.out.println(c);
System.out.println(ff);
fr.close();
r.close();
}}
}