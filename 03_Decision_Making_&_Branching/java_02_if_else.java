
import java.util.Scanner;
public class java_02_if_else {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a = sc.nextInt();
        if (a%2==0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
