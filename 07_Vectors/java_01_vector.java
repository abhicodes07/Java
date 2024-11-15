import java.util.Vector;

public class java_01_vector {
    public static void main(String[] args) {
        // Vector initialization without size
        Vector data = new Vector();

        // Vector initialization with size
        // Vector Lname = new Vector(3);

        // insert  elements in vectors
        data.add("Flynn");
        data.add("Mark");
        data.add("Josh");

        int size = data.size();
        String[] lstnames =  new String[size];
        data.copyInto(lstnames);
        for (int i = 0; i < size; i++) {
            System.out.println(lstnames[i]);
        }
        System.out.println(data);
    }
}
