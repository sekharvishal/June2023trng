import java.util.Scanner;
class Patt4{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();

Pattern(n);
}

public static void Pattern(int n){

for(int i=n;i>=1;i--){len(i);}
}
public static void len(int i){
System.out.println();

for(int j=1;j<=i;j++){
System.out.print(j);
}

}

}