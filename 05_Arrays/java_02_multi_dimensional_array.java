import java.util.Scanner;
public class java_02_multi_dimensional_array {
    public static void main(String[] args) {
        int arr[][]; // declaration
        arr = new int[3][3]; // initialisation: 3 x 3 Matrix
        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Input values at run-time
        for (int i = 0; i < 3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("Enter the value of arr[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Array List: ");
        // Display array
        for (int k = 0; k < 3; k++){
            for (int l = 0; l < 3; l++) {
                System.out.print(arr[k][l] + ", ");
            }
        }
    }
}
