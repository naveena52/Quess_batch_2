// primefactor of a given number//
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome ");
        System.out.println("Enter any number of your choice : ");
        int n = sc.nextInt();
        System.out.println("the primefactors are : ");
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.println(i + "");
                n = n / i;
            }
        }
        if (n > 2) {
            System.out.println(n);
        }
    }
}