class VarArgs {
    VarArgs(String... person) {
        for (String i: person) {
            System.out.println("Hello! " + i);
        }
    }
}
public class java_04_method_with_varargs {
    public static void main(String[] args) {
        VarArgs va = new VarArgs("Flynn", "Dev", "Shiv", "Max", "Lewis");
    }
}
