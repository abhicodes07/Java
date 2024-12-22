class Vehicular {
    Vehicular() {
        System.out.println("This is a vehicle");
    }
}
interface FourWheeled {
    void type();
}
class Cars extends Vehicular
    implements FourWheeled {
    public void type(){
        System.out.println("This vehicle is a Four Wheeler");
    }
    Cars() {
        super();
        type();
    }
}
public class java_04_multiple_inheritance2 {
    public static void main(String[] args) {
        Cars c = new Cars();
    }
}
