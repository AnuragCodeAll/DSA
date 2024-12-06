import java.util.Scanner;
public class swap {
    // Method to swap two elements

    public static void swap(int i, int j) {
        
        int temp = i;
        i = j;
        j = temp;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        swap(num1, num2);
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        scanner.close();
    }
}
