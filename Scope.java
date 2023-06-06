class Scope{
public static void main(String[] args){
int i;
i=100;
System.out.println(i);
{
int j=55;
i=i*j;
System.out.println(i+" \n"+j);
}
System.out.println(i);
}
}