class Vehicle {
    // Base Class Constructor
    Vehicle() {
        System.out.println("This is a Vehicle!");
    }
}

class FourWheeler extends Vehicle {
    // Derived class constructor
    FourWheeler() {
        /*
         * The subclass constructor uses the keyword `super` to
         * invoke the constructoe method of the superclass.
         */
        super();
        System.out.println("This Vehicle is a Four Wheeler!");
    }
}

public class java_01_single_inheritance {
    public static void main(String[] args) {
        FourWheeler fw = new FourWheeler();
    }
}
