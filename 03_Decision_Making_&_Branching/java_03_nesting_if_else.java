public class java_03_nesting_if_else {
    public static void main(String[] args) {
        int a = 325, b = 712, c = 478;
        System.out.println("Largest value is: ");
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
        else {
            if (c > b) {
                System.out.println(c);
            }
            else {
                System.out.println(b);
            }
        }
    }
}
