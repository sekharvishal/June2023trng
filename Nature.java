final class Nature{
void beauty(){System.out.println("Nature's beauty");}}
// cannot inherit from final


class Tree extends Nature{
void beauty(){System.out.println("Trees's beauty ");}
public static void main(String[]args){
Tree t=new Tree();
t.beauty();
}
}
