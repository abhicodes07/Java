public class java_04_for_each {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] names = {"Flynn", "Sam", "Nocturnal", "Chris", "Bob"};

        for (int n: number){
            System.out.println(n);
        }

        for (String str: names) {
            System.out.println(str);
        }
    }
}
