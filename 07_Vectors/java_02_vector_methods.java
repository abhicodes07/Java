import java.util.Vector;
public class java_02_vector_methods {
    public static void main(String[] args) {
        Vector data = new Vector();
        data.add(2);
        data.add("Hii");
        data.add(23.3);
        data.add(true);

        System.out.println("Size of vector: " + data.size());
        System.out.println(data);
    }
}
