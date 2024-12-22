interface Device {
    String type = "Laptop";
    String company = "Lenovo";
    int id = 101;
    void display();
}

class Information implements Device {
    String type = "Phone";
    String company = "Realme";
    int id = 1102;
    public void display() {
        System.out.println("Type of Device: " + type);
        System.out.println("Name of the company: " + company);
        System.out.println("ID: " + id);
    }
}
public class java_01_interfaces {
    public static void main(String[] args) {
        Information info = new Information();
        info.display();

        Device d;   // Interface object
        d = info;   // d refers to the info object
        d.display();
    }
}
