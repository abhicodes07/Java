import java.util.Scanner;

// Rectangle Class
class Rectangle {
    // class variable
    int length;
    int breadth;
    Scanner sc = new Scanner(System.in);

    // default constructor
    Rectangle() {
        System.out.println("Enter the dimensions of rectangle: ");
        System.out.print("\t Enter the length: ");
        length = sc.nextInt();
        System.out.print("\t Enter the breadth: ");
        breadth = sc.nextInt();
    }

    // Class Method
    int getArea() {
        return length*breadth;
    }
}

// Class with main method
public class java_01_default_constructor {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Area: " + rect.getArea());
    }
}
