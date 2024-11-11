/*
Find the number of vowels in a sentence taken as a input form the user
 */
import java.util.Scanner;
public class java_10_pr_02 {
    public static void main(String[] args) {
        String query;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something more than 3 words: ");
        query = sc.nextLine();
        int temp = 0;
        for (int i = 0; i < query.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (query.charAt(i) == vowels[j]){
                    System.out.println("Position of " + query.charAt(i) + ": " + i );
                    temp += 1;
                }
            }
        }
        System.out.print("Number of vowels in a string: " + temp);
    }
}
