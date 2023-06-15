class StringBuilderEX6{
public static void main(String[]args){
StringBuilder sb=new StringBuilder();
sb.append("HELLO");
System.out.println(sb.capacity());
sb.append("Java is my favoriate language");
System.out.println(sb.capacity());
sb.append("Java is my favoriate language");
sb.append("Java is my favoriate language");
System.out.println(sb.capacity());
}}