import java.util.Scanner;
public class java_03_matrix {
    public static void main(String[] args) {
        int matrix[][];
        matrix = new int[3][3];
        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Input values at run-time
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the value of matrix[" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array List: ");
        // Display array
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(matrix[k][l] + ", ");
            }
            System.out.println();
        }
    }
}