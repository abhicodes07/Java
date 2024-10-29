public class java_03_do_while {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            sum += i;
            i += 2;
        } while (sum<40 || i < 10);
        System.out.println("Sum: " + sum);
    }
}
