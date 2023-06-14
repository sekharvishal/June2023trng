import java.io.*;
class FileRead3{
public static void main(String[]args) throws Exception{
FileReader fr= new FileReader("E:\\fh\\demo.txt");
BufferedReader br= new BufferedReader(fr);
int i;
int c=0;
while((i=br.read())!=-1){

if(((char)i>='0')&&((char)i<='9')){
c++;
}
}


System.out.println(c);



br.close();
fr.close();
}
}