/*
Evaluate the expression: side = sqrt(a^2 + b^2 - 2ab*cos(x))
*/

import java.lang.Math;
import java.util.Scanner;

public class pr_02 {
    public static void main(String[] args) {
        double side;
        double a, b;
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        b = sc.nextDouble();

        System.out.print("Specify the angle: ");
        x = sc.nextDouble();

        side = Math.sqrt((a*a) + (b*b) - (2*a*b*Math.cos(x)));
        System.out.println("Side: " + side);
    }
}
