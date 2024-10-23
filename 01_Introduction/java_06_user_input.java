import java.util.Scanner;

public class java_06_user_input {
  public static void main(String[] args) {
    System.out.println("Program for taking input from the user.");

    // Create a scanner class object
    Scanner sc = new Scanner(System.in);

    /* Integer input - nextInt() method*/
    System.out.println("Taking integer input.");
    System.out.println("Enter number1: ");
    int a = sc.nextInt(); // read an integer

    System.out.println("Enter number2: ");
    int b = sc.nextInt();

    int sum = a + b;
    System.out.println("Sum: " + sum + "\n\n");

    /* String input - next() and nextLine() method */
    System.out.println("Taking string input.");
    System.out.println("\nEnter string1: ");
    String s1 = sc.next(); // does not read with white spaces i.e., only reads single word
    System.out.println("Half string: " + s1);

    System.out.println("Enter string2: ");
    String s2 = sc.nextLine(); // reads string input along with white spaces
    System.out.println("Full string: " + s2 + "\n\n");

    /* Other data types as inputs from the user */
    // nextFloat()
    System.out.println("Taking float number input.");
    System.out.println("Enter 1st float number: ");
    float f1 = sc.nextFloat();

    System.out.println("Enter 2nd float number: ");
    float f2 = sc.nextFloat();

    float float_sum = f1 + f2;
    System.out.println("Sum of float numbers: " + float_sum + "\n\n");

    // nextDouble()
    System.out.println("Taking double number input.");
    System.out.println("Enter 1st double number: ");
    double d1 = sc.nextDouble();

    System.out.println("Enter 2nd double number: ");
    double d2 = sc.nextDouble();

    double double_sum = d1 + d2;
    System.out.println("Sum of double number: " + double_sum);

  }
}
