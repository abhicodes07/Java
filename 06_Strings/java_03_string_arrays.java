import java.util.Scanner;
public class java_03_string_arrays {
    public static void main(String[] args) {
        // String array
        String[] cities = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of the cities: ");
            cities[i] = sc.nextLine();
        }
        System.out.println();
        System.out.print("City name: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(' ' + cities[j]);
        }
        System.out.println();
    }
}
