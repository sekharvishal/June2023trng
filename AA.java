class AA{
public static void main(String[]args){
int sum=0;
int pro=1;
for(String i:args){
sum=sum+Integer.parseInt(i);
}
for(String i:args){
pro=pro*Integer.parseInt(i);
}
System.out.println("Sum of digits : "+sum);
System.out.println("product of digits : "+pro);
}
}

