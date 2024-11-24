// class Student
class Student {
    int rno;
    String name;
    int fee;

    // default constructor
    Student() {
        System.out.println("Information of students: ");
    }

    // Parameterized Constructor
    Student(int r, String n, int f) {
        rno = r;
        name = n;
        fee = f;
    }

    // Methods
    void getInfo() {
        System.out.println("\tName: " + name + "\n\tRoll no: " + rno + "\n\tFee: " + fee);
    }
}

public class java_03_constructor {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(20, "Flynn", 10000);
        st2.getInfo();
    }
}
