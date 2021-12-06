import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a =cin.nextInt();
        int f=a;
        int b=0;
        while(f>0){
            b=(b*10)+(f%10);
            f=f/10;
        }
        if(a==b)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
