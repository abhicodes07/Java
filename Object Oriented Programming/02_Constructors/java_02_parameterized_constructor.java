// Class Triangle
class Triangle {
    // class Variable
    int breadth;
    int height;

    // Parameterized constructor
    Triangle (int l, int h) {
        breadth = l;
        height = h;
    }

    // Class Method
    double getArea() {
        return 0.5*breadth*height;
    }
}
public class java_02_parameterized_constructor {
    public static void main(String[] args) {
        Triangle t = new Triangle(30, 20);
        System.out.println("Area: " + t.getArea());
    }
}
