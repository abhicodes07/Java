class CountObjects {
    static int count = 0;

    CountObjects( String c, String p) {
        CountObjects.count += 1;
    }

    // Static method
    static void countObj() {
        System.out.println("Number of objects: " + CountObjects.count);
    }
}

public class java_02_no_of_objects {
    public static void main(String[] args) {
        CountObjects c1 = new CountObjects("a", "b");
        CountObjects.countObj();
        CountObjects c2 = new CountObjects("c", "d");
        CountObjects c3 = new CountObjects("e", "f");
        CountObjects c4 = new CountObjects("g", "h");
        CountObjects c5 = new CountObjects("i", "j");
        CountObjects.countObj();
    }
}
