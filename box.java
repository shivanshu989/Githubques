import java.util.Scanner;

public class Box { Box(int a,int b,int c){
        volume(a,b,c);
    }
    void volume(int a,int b,int c){
        System.out.println(a*b*c);
    }
}

class Out{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a= cin.nextInt();
        int b= cin.nextInt();
        int c= cin.nextInt();
        Box obj=new Box(a,b,c);
    }
}
