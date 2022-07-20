 // 13 - java program for count the number of prime numbers//
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter lower bound :");
        int low = reader.nextInt();
        System.out.println("Enter upper bound :");
        int high = reader.nextInt();
        while (low <= high) {
            boolean check = true;
            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    check = false;
                    break;

                }
            }
            if (check) {
                System.out.println(low + "");


            }
            ++low;
        }
    }
}
