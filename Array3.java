class Multidimentionalarray1{
public static void main(String[]args){
int[][][] a={

{ {4,5,6,7,9},{3,5,8,8,5,3} },
{  {8,4,7,8}, {1},{2,3} }
};
for(int[][]array2D:a){
for(int[]array1D:array2D){
for(int item:array1D){
System.out.println(item);}}}

}
}