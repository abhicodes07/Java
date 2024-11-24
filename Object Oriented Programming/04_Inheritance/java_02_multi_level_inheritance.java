class Vehicles {
    // Base Class Constructor
    Vehicles() {
        System.out.println("This is a Vehicle!");
    }
}

class FourWheelers extends Vehicles{
    // Intermediate class / Derived Class
    FourWheelers() {
        super(); // invokes the constructor of Vehicle class
        System.out.println("This vehicle is a Four wheeler!");
    }
}

class Car extends FourWheelers {
    // Derived Class Constructor
    Car() {
        super(); // Invokes the constructor of Four Wheeler class
        System.out.println("This four wheeler vehicle is a car!");
    }
}

public class java_02_multi_level_inheritance {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
