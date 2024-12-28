class MyThreads extends Thread {
    @Override
    public void run(){
        while (true) {
            System.out.println("My cooking thread is running.");
            System.out.println("I am happy.");
        }
    }
}
class MyThreads2 extends Thread {
    @Override
    public void run(){
        while (true) {
            System.out.println("Thread 2 for chatting with her.");
            System.out.println("I am sad.");
        }
    }
}
public class java_01_threads {
    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads2 t2 = new MyThreads2();
        t1.start(); // calls run method
        t2.start(); // calls run method
    }
}
