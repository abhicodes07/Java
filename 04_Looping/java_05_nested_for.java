import java.util.Scanner;
public class java_05_nested_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
