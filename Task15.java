
// 15 - count the number of factors //
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Intelliji");
        System.out.println("please enter the number :");
        int n = sc.nextInt();
        System.out.println("The number of factors are :");
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a++;
            }
        }
        System.out.println(a);


    }
}
