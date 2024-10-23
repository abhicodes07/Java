public class java_04_assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a += b: " + (a += b));
        System.out.println("a -= b: " + (a -= b));
        System.out.println("a /= b: " + (a /= b));
        System.out.println("a %= b: " + (a *= b));
        System.out.println(a);
    }
}
