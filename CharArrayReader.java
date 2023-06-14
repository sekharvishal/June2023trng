import java.io.CharArrayReader;
 class CharArrayEx{
public static void main(String[]a)throws Exception{
char[] arr={'j','a','v','a','p','o','i','n','t'};
CharArrayReader reader=new CharArrayReader(arr);
int k=0;
while((k=reader.read())!=-1){
char ch=(char)k;
System.out.println(ch+" :");

System.out.println(k);
}
}}