import java.util.Scanner;
public class java_01_one_dimensional_array {
    public static void main(String[] args) {
        int arr[]; // declaration
        arr = new int[5]; // initialisation
        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Input values at run-time
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the value of arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array List: ");
        // Display array
        for (int j = 0; j < 5; j++){
            System.out.print(arr[j] + ", ");
        }
    }
}
