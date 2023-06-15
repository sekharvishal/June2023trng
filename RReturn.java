import java.util.Arrays;
class ReturnArrayExample1{
public static int[]numbers()
{
int[]arr={5,6,7,8,9};
return arr;
}
public static void main(String[]args)
{
int[]a=numbers();
for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");
}
}
