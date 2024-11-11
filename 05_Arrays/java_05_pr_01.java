public class java_05_pr_01 {
    public static void main(String[] args) {
        int m;
        int x[] = new int[10];
        int[] y = new int[11];
        for (m=1; m<10; ++m){
            x[m] = y[m] = m;
        }
        x = y = new int[20];
        for (m=0; m<10; ++m){
            System.out.println(x[m]);
        }
    }
}
