class Author{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author author;
Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String[]args){
Author author=new Author("VISHAL",42,"USA");
Book  b=new Book("\nJava to  Beginer",800,author);
System.out.println("-------------------------------Book Details-------------------------");
System.out.println("\nBook name: "+b.name);
System.out.println( "\nBook price: "+b.price);
System.out.println( "\n------------------------------Author Details-----------------------");
System.out.println( "\nAuthor name: "+b.author.authorName);
System.out.println( "\nAuthor  age: "+b.author.age);
System.out.println( "\nAuthor place: "+b.author.place);
}
}