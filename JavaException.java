 class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
     int data=100/0;  
//String s=null;
//String ss="abc";
//int i=Integer.parseInt(ss);

//int a[]=new int[5];
//a[10]=50;

//System.out.print(s.length());
   }catch(ArithmeticException a){System.out.println(a);}  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
} 