import java.util.Scanner;
public class java_02_string_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query;
        System.out.print("Enter something more than three 3 words: ");
        query = sc.nextLine();

        // Return the length of the string
        System.out.print("Length of the string: " + query.length());
        System.out.println();

        // Concatenate two strings
        String Fname, Lname;
        System.out.print("Enter your first name: ");
        Fname = sc.nextLine();
        System.out.print("Enter your last name: ");
        Lname = sc.nextLine();

        System.out.println();

        String fullname = Fname + ' ' + Lname;
        System.out.print("Full name: " + fullname);
    }
}
