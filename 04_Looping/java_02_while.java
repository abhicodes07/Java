import java.util.Scanner;
public class java_02_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        int rows;
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        while (x < rows) {
            System.out.println();
            while (y < x) {
                System.out.print("* ");
                y++;
            }
            x++;
        }
    }
}
