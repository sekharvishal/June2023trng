public class CharAtExample4{
public static void main(String args[]){
String s1="Welcome to java Mr.vishal";
System.out.println("\n \n ----------------------=>#######  At Even Places ####### <=---------------");
for(int i=0;i<=s1.length()-1;i++){
if(i%2==0){
System.out.println("Character  at "+i+"is :" + s1.charAt(i));

}
}
System.out.println("\n \n ---------------------=> ############ At Odd Places ######### <=---------------");
for(int j=0;j<=s1.length()-1;j++){
if(j%2!=0){
System.out.println("Character  at "+j+"is :" + s1.charAt(j));

}
}
}
}