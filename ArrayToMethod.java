import java.util.Scanner;
class ArraysToMethod{
public int max(int[]array){
int max=0;
for(int i=0;i<array.length;i++){
if(array[i]>max){
max=array[i];}
}
return max;
}
public int min(int[]array){
int min=array[0];
for(int i=0;i<array.length;i++){
if(array[i]<min){min=array[i];}
}
return min;
}


public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array that is to be created : ");
int size=sc.nextInt();
int[] myarray=new int[size];
System.out.println("Enter the elements of the array ");
for(int i=0;i<size;i++){myarray[i]=sc.nextInt();}
ArraysToMethod m=new ArraysToMethod();
System.out.println("max value in the array is : "+m.max(myarray));
System.out.println("min value in the array is : "+m.min(myarray));
}
}
