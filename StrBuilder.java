class StrBuilder{
public static void main(String args[]){
StringBuilder s1= new StringBuilder(" S ");
StringBuilder s2=new StringBuilder(" Vishal");
StringBuilder s=s1.append(s2);
System.out.print(s.toString());
}
}