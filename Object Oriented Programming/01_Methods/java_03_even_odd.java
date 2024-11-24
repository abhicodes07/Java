import java.util.Scanner;
public class java_03_even_odd {
    static void isEven(int x) {
        if (x % 2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        isEven(num);
    }
}
