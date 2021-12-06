import java.util.Scanner;

public class Book {
    String name;
    String author;
    double price;
    int stock;
    Book(String a,String b,double c,int d){
        name=a;
        author=b;
        price =c;
        stock=d;
    }
}

class Print{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String a=cin.nextLine();
        String b=cin.nextLine();
        double c=cin.nextDouble();
        int d=cin.nextInt();
        Book obj=new Book(a,b,c,d);
        System.out.println(obj.name+"\n"+obj.author+"\n"+obj.price+"\n"+obj.stock);
    }
}
