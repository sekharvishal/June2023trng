public class WrapperExample3{
public static void main(String[]args){
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0F;
double d=60.0D;
char c='a';
boolean b2=true;
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Double doubleobj=d;
Float floatobj=f;
Character charobj=c;
Boolean booleanobj=b2;
System.out.println("\n\n--------------------Printing  object values-----------------------------\n\n");
/*


System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(c);
System.out.println(b2);

*/

System.out.println("Byte object :"+byteobj);
System.out.println("short object :"+shortobj);
System.out.println("int object :"+intobj);
System.out.println("long object:"+longobj);
System.out.println("float object:"+floatobj);
System.out.println("double object :"+doubleobj);
System.out.println("char object :"+charobj);
System.out.println("boolean object :"+booleanobj);

byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean booleanvalue=booleanobj;
System.out.println("\n\n--------------------Printing   values-----------------------------\n\n");

System.out.println("Byte value :"+bytevalue);
System.out.println("short value :"+shortvalue);
System.out.println("int value :"+intvalue);
System.out.println("long value:"+longvalue);
System.out.println("float value:"+floatvalue);
System.out.println("double value :"+doublevalue);
System.out.println("char value :"+charvalue);
System.out.println("boolean value :"+booleanvalue);



}
}

