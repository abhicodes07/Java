class Greet {
    void greet() {
        System.out.println("Hello There!");
    }

    void greet(String n) {
        System.out.println("Hello, " + n);
    }
}
public class java_01_method_overloading {
    public static void main(String[] args) {
        Greet gr = new Greet();
        String name = "Abhinav";
        gr.greet();
        gr.greet(name);
    }
}
