class Students {
    int roll;
    void getNumber(int n) {
        roll = n;
    }
    void putNumber() {  // Display Roll Number
        System.out.println("Roll Number: " + roll);
    }
}

class Test extends Students {
    float part1, part2;
    void getMarks(float m1, float m2) {
        part1 = m1;
        part2 = m2;
    }
    void putMarks() {   // Display Marks
        System.out.println("Marks Obtained: ");
        System.out.println("Part 1 = " + part1);
        System.out.println("Part 2 = " + part2);
    }
}

interface Sports {
    float sportWt = 6.0F;
    void putwt();
}

class Results extends Test implements Sports {
    float total;
    public void putwt() {
        System.out.println("Sports wt = " + sportWt);
    }
    void display() {
        total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putwt();
        System.out.println("Total Score: " + total);
    }
}

public class java_03_multiple_inheritance {
    public static void main(String[] args) {
        Results student1 = new Results();
        student1.getNumber(1234);
        student1.getMarks(27.5f, 33.0f);
        student1.display();
    }
}
