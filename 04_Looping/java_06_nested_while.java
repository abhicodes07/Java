import java.util.Scanner;

public class java_06_nested_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int rows;
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        while (x <= rows) {
            int y = 1;
            while (y <= x) {
                System.out.print("* ");
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
