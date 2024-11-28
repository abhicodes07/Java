/*
* Compile Time Method Overriding
*/
class Animal {
    void sound() {
        System.out.println("This is a animal sound!");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks!");
    }
}

public class java_02_method_overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
