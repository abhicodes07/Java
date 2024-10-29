public class java_08_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip the current iteration if i is even
            }
            System.out.println(i);  // This will print only odd numbers
        }
    }
}
