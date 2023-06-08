class TestOuter{
static int  data=30;
//                             System.out.println("vv");
static class Inner{
void msg(){System.out.println("data is "+data);}
}
public static void main(String[]args){

TestOuter.Inner obj=new TestOuter.Inner();
//                    TestOuter c=new TestOuter();

obj.msg();
}
}