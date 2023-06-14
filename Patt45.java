import java.util.Scanner;
class Patt45{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();

Pattern(n);
}

public static void Pattern(int n){

for(int i=1;i<=n;i++){len(i,n);}
}
public static void len(int i,int a){
System.out.println();

for(int j=(a-i);j>=1;j--){
System.out.print(j);
}

}

}