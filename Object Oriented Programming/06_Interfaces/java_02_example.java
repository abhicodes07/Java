interface Area {    // Define Interface
    void getArea (double x, double y);
}

class RectAngle implements Area {   // Interface implementation
    public void getArea (double x, double y) {
        System.out.println("Area: " + x*y);
    }
}
public class java_02_example {
    public static void main(String[] args) {
        RectAngle rect = new RectAngle();
        rect.getArea(20, 30);
    }
}
