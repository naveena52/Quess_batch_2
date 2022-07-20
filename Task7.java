// 7 - Mr.Lalwani currency//
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        System.out.println("welcome Mr.Lalwani ");
        System.out.println("Mr.Lalwani please enter the currency :");
        Scanner sc = new Scanner(System.in);
        int currency = sc.nextInt();
        System.out.println("enter the number of currency :");
        int n = sc.nextInt();
        int noofcurrency = n;
        int reverse = 0, remainder = 0;
        ;
        while (noofcurrency != 0) {
            remainder = noofcurrency % 10;
            reverse = reverse * 10 + remainder;
            noofcurrency = noofcurrency / 10;
        }
        if (reverse == n) {
            System.out.println("your return :" + (currency * 3));

        } else {
            System.out.println("your return : " + currency);
        }
    }
}


