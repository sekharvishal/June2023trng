import java.util.*;
class Search_ele{
public static void main(String[]args){
int n,x,flag=0,i=0;
Scanner s=new Scanner(System.in);
System.out.println("\nEnter no.of elements you want in array :");
n=s.nextInt();
int[] a=new int[n];
System.out.println("\nEnter all the elements");
for (i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("\nEnter the element that you find");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{ flag=1;
break;
}
else{
flag=0;
}
}
if(flag==1)
{
System.out.print("\nElement is found at : "+(i+1));
}
else{
System.out.print("\nElement is not found");
}
}
}
