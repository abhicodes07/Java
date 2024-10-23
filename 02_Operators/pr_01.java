/*
* evaluate the expression: Area = pi*r^2 + 2*pi*r*h
*/
import java.util.Scanner;

public class pr_01 {
    final static double PI = 3.14;
    public static void main(String[] args) {
        double area;
        double r;
        double h;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: "); // print function does not ends a statement with a new line
        r = sc.nextDouble();

        System.out.print("Enter the height: ");
        h = sc.nextDouble();

        area = (PI*r*r) + (2*PI*r*h);
        System.out.println("Area: " + area);

    }
}
