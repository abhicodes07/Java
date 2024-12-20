import java.lang.StringBuffer;
public class java_03_string_buffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("This is a StringBuffer implementation.");
        System.out.println("Original String: " + str);

        // Length of the string
        System.out.println("Length of the string: " + str.length());

        // Accessing characters in a string
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at position " + i + " is : " + str.charAt(i));
        }
    }
}
