public class java_08_special {
    public static class Test {
        void print() {
            System.out.println("Hello!");
        }
    }
    public static void main(String[] args) {
        // initialise object of a string
        Test t = new Test();
        t.print(); // dot operator

        // check if it is instanceof or not
        System.out.println("Is instance of: " + (t instanceof Test));
    }
}
