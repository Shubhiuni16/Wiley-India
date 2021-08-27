import java.util.HashSet;
import java.util.Scanner;
class Book{
    int id;
    String name;
    String author;
    String publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class HashSetTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Book> set = new HashSet<>();
        for(int i=0;i<2;i++){
            set.add(new Book(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        sc.close();
        boolean publisherCheck=false;

        for(Book b:set){
            System.out.println("ID: "+b.id);
            System.out.println("Name: "+b.name);
            System.out.println("Author: "+b.author);
            System.out.println("Publisher: "+b.publisher);
            System.out.println("Quantity: "+b.quantity);
            if((b.publisher).equalsIgnoreCase("Wiley")){
                publisherCheck=true;
            }
            if(b.quantity<4){
                set.remove(b);
            }
        }
        for(Book b:set){
            System.out.println("Name of book from Wiley: "+b.name);
        }
        if(publisherCheck==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
