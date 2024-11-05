import java.util.Scanner;
public class java_04_sorting_array {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        Scanner sc = new Scanner(System.in);

        // input values
        for (int i = 0; i < 10; i++){
            System.out.print("Enter the value of array[" + i + "] : ");
            array[i] = sc.nextInt();
        }

        // display unsorted array
        System.out.print("Array list: ");
        for (int k = 0; k < 10; k++) {
            System.out.print(array[k] + " ");
        }

        // sort
        int temp;
        for (int x = 0; x < 10; x++) {
            for (int y = x + 1; y < 10; y++) {
                if (array[x] > array[y]) {
                    temp = array[x];
                    array[x] = array[y];
                    array[y] = temp;
                }
            }
        }

        // display sorted array
        System.out.print("\nSorted array: ");
        for (int k = 0; k < 10; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
