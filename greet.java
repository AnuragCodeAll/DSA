import java.util.Scanner;
public class greet {
    public static void Grt() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        
        Grt();
    }
}   