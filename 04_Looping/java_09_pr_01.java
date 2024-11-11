/*
* print the following output
   0
   11
   222
   3333
   44444
*/

import java.util.Scanner;
public class java_09_pr_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
