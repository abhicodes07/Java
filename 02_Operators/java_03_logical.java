public class java_03_logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("a>b && a<10: " + (a>b&&a<10));
        System.out.println("a>b || a<10: " + (a>b || a<10));
        System.out.println("!(a>b): " + !(a>b));
    }
}
