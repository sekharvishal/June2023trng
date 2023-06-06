import java.util.Scanner;
class IfExample{
public static void main(String [] args){
Scanner sc=new   Scanner(System.in);

int  i,j,max;
System.out.println("\n \nEnter 1st number");
i=sc.nextInt();
System.out.println("\n \n Enter 2nd number");
j=sc.nextInt();
if(i>j){System.out.println(i+"is greater");}
else{System.out.println(j+"is greater");}
}
}