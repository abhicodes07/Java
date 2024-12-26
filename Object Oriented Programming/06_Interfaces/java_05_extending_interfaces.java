interface Camera {
    void takeShot();
}

interface Snap extends Camera{
    void takeSnap();
}

class MyCamera
    implements Camera{
    public void takeShot() {
        System.out.println("Taking shot!!!");
    }
    public void takeSnap() {
        System.out.println("Taking snap!!");
    }
}
public class java_05_extending_interfaces {
    public static void main(String[] args) {
        MyCamera mc = new MyCamera();
        mc.takeShot();
        mc.takeSnap();
    }
}
