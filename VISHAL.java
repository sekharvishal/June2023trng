class VISHAL{
public static void main(String[]args){
int[] a={1,2,3,4,5};
int sum=0;
for(int num:a){
sum+=num;
}
int arrlen=a.length;
double average=((double)sum / (double)arrlen);
System.out.println(sum);
System.out.println(average);
}
}
