import java.util.Scanner;

public class java_01_for {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("This is a loop running 10 times.");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int x=0; x < rows; x++) {
            System.out.println();
            for (int y = 0; y < x+1; y++) {
                System.out.print("* ");
            }
        }
    }
}
