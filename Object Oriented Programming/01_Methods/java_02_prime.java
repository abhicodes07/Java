import java.util.Scanner;
public class java_02_prime {
    static void isPrime(int x){
        int flag = 0;

        if (x <= 1) {
            flag = 1;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0){
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Prime!");
        } else {
            System.out.println("Not Prime!");
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        isPrime(num);
    }
}
