import java.util.Scanner;

public class java_01_arithmetic {
    public static void main(String[] args) {
        // Arithmetic Operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a/b: " + (a/b));
        System.out.println("a%b: " + (a%b));
    }
}
