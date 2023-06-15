import java.util.StringTokenizer;
class Simple2{
public static void main(String[]args){
StringTokenizer st=new StringTokenizer("my,name,is,Vishal ");
System.out.println("Next token is : "+st.nextToken(","));
System.out.println("Next token is : "+st.nextToken(","));
System.out.println("Next token is : "+st.nextToken(","));
System.out.println("Next token is : "+st.nextToken(","));
}
}
