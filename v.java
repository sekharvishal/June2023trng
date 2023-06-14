import java.util.*;
class v extends Exception{
String msg;
v(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int roll=sc.nextInt();
String name=sc.next();
int marks=sc.nextInt();
try{
if(marks<0){
throw new v("marks should not be negative marks=0");
}
} catch(v ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}}}
