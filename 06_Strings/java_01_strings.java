public class java_01_strings {
    public static void main(String[] args) {
        // character array
        char[] name = new char[7];
        name[0] = 'A';
        name[1] = 'b';
        name[2] = 'h';
        name[3] = 'i';
        name[4] = 'n';
        name[5] = 'a';
        name[6] = 'v';

        System.out.println(name);
        for (int i = 0; i < 7; i++) {
            System.out.println(name[i]);
        }
    }
}
