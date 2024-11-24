class Book {
    static int count = 0;
    String title;
    String author;

    // constructor
    Book (String t, String a) {
        title = t;
        author = a;
        Book.count += 1; // access static variable
    }

    // Static Method
    static void count() {
        System.out.println("Number of books available: " + Book.count);
    }
}
public class java_01_static_methods {
    public static void main(String[] args) {
        Book b1 = new Book("Metamorphosis", "Franz Kafka");
        Book.count();
        Book b2 = new Book("Crime & Punsishment", "Dostoyevesky");
        Book.count();
        Book b3 = new Book("Algorithms", "CLRS");
        Book.count();
    }
}
